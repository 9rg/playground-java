package designPattern.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeSELECT(new String[] {"EMP_ID", "EMP_NAME", "EMP_POST"});
        builder.makeFROM("M_EMPLOYEE", "EMP");
        builder.makeWHERE(new String[] { "EMP_NAME LIKE '.*山$'", "EMP_POST='営業部'" });
        builder.makeORDER("EMP_ID", "ASC");
        builder.close();
    }
}