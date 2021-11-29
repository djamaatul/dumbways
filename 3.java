class main {
///djamaatul anbiya
///runner https://onecompiler.com/java/3xju5pdqh
    public static void main(String[] args) throws Exception {
        char[] dumbways = { 'D', 'U', 'M', 'B', 'W', 'A', 'Y', 'S', 'I', 'D' };
        for (int i = 0; i < 3; i++) {
            int awal; // Patern 0 = '=' && Patern 0 = '*'
            if (i < 2) {
                awal = 0; // awal patern adalah 0 atau genap atau character '='
            } else {
                awal = 1;
            }
            for (int j = awal; j < dumbways.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(" =");
                } else {
                    System.out.print(" *");
                }
            }
            if(i == 2){
                System.out.print(" =");
            }
            System.out.print("\n");
        }

        /////////// print char D U M W A Y A S I D
        for (int i = 0; i < dumbways.length; i++) {
            System.out.printf(" %c", dumbways[i]);
        }

        for (int i = 0; i < 3; i++) {
            int awal; // Patern 0 = '=' && Patern 0 = '*'

            if (i < 1) {
                awal = 1;
            } else {
                awal = 0;
            }

            System.out.print("\n");
            for (int j = awal; j < dumbways.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(" =");
                } else {
                    System.out.print(" *");
                }
            }
            if(i == 0){
              System.out.print(" =");
            }

        }

    }
}
