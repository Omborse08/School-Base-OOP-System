package School;

class Professior extends Person {

    Professior(int id,String name,String gmail) {
        super(id,name,gmail);
    }

    @Override
    String getRole() {
        return "Professor";
    }
}