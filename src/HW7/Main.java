package HW7;

public class Main {

    public static void main(String[] args) {
        Soldier soldier = new Soldier("Rembo", 1000, 200, 500);
        SuperMario superMario = new SuperMario("Mario", 200, 150, 200);

        soldier.run();
        soldier.shot();
        soldier.skill();
        soldier.showCharacteristics();
        soldier.openInventar();
        soldier.closeInventar();

        System.out.println();

        superMario.jump();
        superMario.swim();
        superMario.skill();
        superMario.showCharacteristics();
        superMario.openInventar();
        superMario.closeInventar();

        System.out.println();


        testLiamda(new Runeible() {
            @Override
            public void run() {
                System.out.println("побежали..");
            }
        });

        testLiamda (() -> System.out.println("побежали еще раз"));


    }

    public static void testLiamda(Runeible j) {
        j.run();
    }


}
