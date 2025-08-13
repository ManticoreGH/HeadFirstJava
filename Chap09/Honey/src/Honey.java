//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey();
        Honey[] ha = { honeyPot, honeyPot, honeyPot, honeyPot};
        Bees bees = new Bees();
        bees.beeHoney = ha;
        Bear[] bears = new Bear[5];
        for (int i = 0; i < 5 ; i++) {
            bears[i] = new Bear();
            bears[i].hunny = honeyPot;
        }
        Kit kit = new Kit();
        kit.honey = honeyPot;
        Raccoon raccoon = new Raccoon();

        raccoon.rh = honeyPot;
        raccoon.rk = kit;

        kit = null;
    } // end main
}