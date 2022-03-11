import java.util.*;
class Ejercicio01{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int select, counter = 0,number = 0;
        double sum = 0;
        List<Integer> pairs = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        System.out.println("Insert the "+counter+"º number.");
        do {
            try {
                number = sc.nextInt();
                if(number <= 100 && number >= 0 && counter < 5) {
                    list.add(number);
                    counter++;
                    if(counter==5){
                        System.out.print("You have entered 5 numbers");
                        break;
                    }else{
                        System.out.println("Insert the "+counter+"º number.");
                    }
                }else {
                            System.out.print("Watch out! You can only enter numbers between 0 and 100.");
                            System.out.println("Re-insert the "+counter+"º number.");
                }
            } catch (InputMismatchException exception){
                System.out.println("Watch out! You can only insert numbers.");
                sc.next();
            } catch (NumberFormatException exception1){
                System.out.println("Watch out! You can only insert numbers.");
                sc.next();
            }
        } while (counter<5);

        // START MENU

        optionsMenu();
        while (!sc.hasNextInt()) {
            sc.next();
        }
        do {
            optionsMenu();
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("ArrayList values: " + list);
                    for(int i = 0; i < list.size(); i++) {
                        System.out.println("Position: "+i);
                        System.out.println("Value: "+list.get(i));
                    }
                    System.out.println("¿What position do you want to modify?");
                    int position = sc.nextInt();
                    System.out.println("¿What value do you want to put?");
                    int newValue = sc.nextInt();
                        if(newValue > 100){
                            System.out.println("Number greater than 100.");
                        }else if(newValue < 0){
                            System.out.println("Number less than 0.");
                        }else {
                            list.add(position,newValue);
                            System.out.println("ArrayList values: " + list);
                        }
                    break;
                case 2:
                    System.out.println("ArrayList values: " + list);
                    for(Number arrayList : list) {
                        sum += arrayList.intValue();
                    }
                    System.out.println("The total of the numbers is:"+sum);
                    break;
                case 3:
                    System.out.println("ArrayList values: " + list);
                    Integer max = Collections.max(list);
                    Integer min = Collections.min(list);
                    System.out.println("ArrayList max value : " + max);
                    System.out.println("ArrayList min value : " + min);
                    break;
                case 4:
                    System.out.println("ArrayList values: " + list);

                    for(int i = 0; i < list.size(); i++) {
                        if(list.get(i) % 2 == 0){
                            pairs.add(list.get(i));
                        }else{
                            odds.add(list.get(i));
                        }
                    }

                    System.out.println("Pairs:");
                    System.out.println(pairs);
                    System.out.println("Odds:");
                    System.out.println(odds);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (select != 0);


    }

    public static void optionsMenu(){
        System.out.println("What do you want to do?");
        System.out.println("1- Modificar el valor almacenado en una posición. ");
        System.out.println("2- Mostrar el resultado de sumar todos los números ");
        System.out.println("3- Mostrar el número más alto y más bajo ");
        System.out.println("4- Ordena el array situando primero todos los números pares y luego los impares ");
        System.out.println("0- Finalizar ");
    }


}
