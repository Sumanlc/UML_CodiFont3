public class main {
    public static void main(String[] args){
        country nepal = new country(1, "Nepal");

        state state = new state(1,"Gandaki", nepal);

        address malepatan = new address (1,"street 123", "Pokahara","67890");

        persona suman = new persona(1,"suman", "987218756","sumanlc06@gamil.com", malepatan);

        addressBook n38297498o = new addressBook(1, "suman", "Malepatan");




    }


}
