class Point {
    int x;
    int y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

   
    void display() {
        System.out.println( x + ", " + y );
    }

  
    public static void main(String[] args) {
        
        Point p1 = new Point();
        System.out.print("Default Constructor: ");
        p1.display();

      
        Point p2 = new Point(10, 20);
        System.out.print("Parameterized Constructor: ");
        p2.display();

       
        Point p3 = new Point(p2);
        System.out.print("Copy Constructor: ");
        p3.display();
    }
}