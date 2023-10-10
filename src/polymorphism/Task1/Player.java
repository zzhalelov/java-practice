package polymorphism.Task1;

import java.util.Scanner;

//игра-шутер. У игрока должна быть возможность использовать разные виды оружия, в будущем в игру могут быть добавлены новые. Необходимо спроектировать иерархию классов, а также систему слотов для оружия у игрока.
//a shooter game. The player should be able to use different types of weapons, new ones may be added to the game in the future. It is necessary to design a hierarchy of classes, as well as a system of slots for the player's weapons.
public class Player {
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new ShotGun(),
                new RPG(),
                new Rogatka(),
                new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot > weaponSlots.length) {
            System.out.println("Invalid slot number. Weapon not found");
            return;
        }
        weaponSlots[slot].shot();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;
        do {
            System.out.println("Enter slot number: ");
            slot = scanner.nextInt();
            if (slot >= 0) {
                player.shotWithWeapon(slot);
            }
        } while (slot >= 0);
        System.out.println("Game over!");
    }
}