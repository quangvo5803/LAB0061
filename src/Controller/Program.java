package Controller;

import Repository.CalculateRepository;
import Repository.ICalculateReopsitory;
import View.Menu;

public class Program extends Menu<String> {
    private ICalculateReopsitory calculateReopsitory;
    static String[] mainChoice = { "Rectangle", "Circle", "Triagle" };

    public Program() {
        super("========== Calculator Shape Program ==========", mainChoice);
        calculateReopsitory = new CalculateRepository();
    }

    public void execute(int n) {
        switch (n) {
            case 1: {
                calculateReopsitory.calculatorRectangle();
                break;
            }
            case 2: {
                calculateReopsitory.calculatorCirlce();
                break;
            }
            case 3: {
                calculateReopsitory.calculatorTriangle();
                break;
            }
            case 4: {
                System.exit(0);
            }
        }
    }

}
