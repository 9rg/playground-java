package designPattern.prototype;
import designPattern.prototype.framework.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        OraAndDialogue jotaroAttack = new OraAndDialogue("オラ");
        OraAndDialogue dioAttack = new OraAndDialogue("無駄");
        gggAndDialogue printWithGgg = new gggAndDialogue("ｺﾞ");
        gggAndDialogue printWithDdd = new gggAndDialogue("ﾄﾞ");

        manager.register("oraora", jotaroAttack);
        manager.register("mudamuda", dioAttack);
        manager.register("gogogo", printWithGgg);
        manager.register("dododo", printWithDdd);

        Product a1 = manager.create("oraora");
        a1.use("やれやれだぜ...");
        Product a2 = manager.create("mudamuda");
        a2.use("このマヌケがー!");
        Product f1 = manager.create("gogogo");
        f1.use("俺が時を止めた...");
        Product f2 = manager.create("dododo");
        f2.use("「THE WORLD(ザ・ワールド)!!!!");
    }
}