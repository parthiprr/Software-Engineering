import java.util.ArrayList;
import java.util.List;

// Component Interface
interface FileSystemComponent {
    void showDetails();
}

// Leaf Class
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Composite Class
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

// Client Code
public class Composite {
    public static void main(String[] args) {
        File file1 = new File("Document.pdf");
        File file2 = new File("Photo.jpg");

        Directory root = new Directory("Root");
        Directory subDir = new Directory("SubFolder");

        root.addComponent(file1);
        subDir.addComponent(file2);
        root.addComponent(subDir);

        root.showDetails();
    }
}
