public class Node extends BaseEntity{
    private String name;

    public Node(String name,int id) {
        this.name = name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}
