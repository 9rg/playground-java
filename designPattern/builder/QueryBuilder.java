package designPattern.builder;

public class QueryBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    private String abbr;

    public void makeSELECT(String[] clms) {
        buffer.append("SELECT");
        for (String clm : clms) {
            buffer.append(" " + clm);
            buffer.append(",");
        }
        buffer.deleteCharAt(buffer.length() - 1);
    }

    public void makeFROM(String table, String abbr) {
        buffer.append(" FROM " + table + " " + abbr);
    }

    public void makeWHERE(String[] conds) {
        buffer.append(" WHERE 1=1");
        for (String cond : conds) {
            buffer.append(" AND " + cond);
        }
    }

    public void makeORDER(String clm, String sc) {
        buffer.append(" ORDER BY " + clm + " " + sc);
    }

    public void close() {
        buffer.append(";");
    }

    public String getResult() {
        return buffer.toString();
    }
}