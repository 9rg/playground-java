package designPattern.builder;

public abstract class Builder {
    public abstract void makeSELECT(String[] clms);
    public abstract void makeFROM(String table, String abbr);
    public abstract void makeWHERE(String[] conds);
    public abstract void makeORDER(String clm, String sc);
    public abstract void close();
}