package services;

import services.interfaces.IGameServices;
import services.interfaces.IManagementServices;
import utils.ColorsUtil;
import utils.MenuUtil;

public class ManagementServices implements IManagementServices {
    private final IGameServices gameServices;

    public  ManagementServices() {
        gameServices = new GameServices();
    }

    @Override
    public void manage() {

        while (true) {
            int option = MenuUtil.showMenu();

            switch (option) {
                case 1 -> {
                    gameServices.start();
                }
                case 2 -> {
                    gameServices.add();
                }
                case 3 -> {
                    gameServices.see();
                }
                case 0 -> {
                    System.exit(-1);
                }
                default -> {
                    System.out.println(ColorsUtil.RED_BOLD + "Option is Invalid!!");
                }
            }

        }

    }
}
