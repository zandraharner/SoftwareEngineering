package withDecorator;

public class testDecorator {
	public static void main(String[] args) {
		
		System.out.println("Creating Simple Shape Objects ... ");
		Shape rectangle = new Rectangle();
		Shape circle = new Circle();
		
		System.out.println("Drawing Simple Shape Object ... ");
		rectangle.draw();
		System.out.println();
		circle.draw();
		System.out.println();
		
		
		System.out.println("Creating Decorated Circle with Red Color, Blue Lines in dash pattern and thickness");
		Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(new LineThicknessDecorator(new Circle(), 2.0d), LineStyle.DASH), Color.BLUE), Color.RED);
		circle1.draw();
		System.out.println();
		
		// order of decorator is also not much important here since all unique functionalities.
		// we can also do this nesting of functionalities in separate statements.
		
		Circle c = new Circle();
		LineThicknessDecorator lt = new LineThicknessDecorator(c, 2.0d);
		LineStyleDecorator ls = new LineStyleDecorator(lt, LineStyle.DASH);
		LineColorDecorator lc = new LineColorDecorator(ls, Color.BLUE);
		FillColorDecorator fc = new FillColorDecorator(lc, Color.RED);
		
		Shape circle2 = fc;
		circle2.draw();
		System.out.println();
		
		// try a different circle
		
		System.out.println("Creating Decorated Circle with Green Color, Black Lines in dash pattern and thickness");
		Shape circle3 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.BLACK), Color.GREEN);
		circle3.draw();
		System.out.println();
		
		System.out.println("Creating Decorated Circle with Yellow Color, Red Lines");
		Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(), Color.RED), Color.YELLOW);
		rectangle1.draw();
		System.out.println();
		
		
		
		
	}
}
