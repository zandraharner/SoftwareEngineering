package withDecorator;

public class LineThicknessDecorator extends ShapeDecorator {
	
	protected double thickness;

	public LineThicknessDecorator(Shape decoratedShape, double thickness) {
		super(decoratedShape);
		this.thickness = thickness;
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line Thickness: " + thickness);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
		
	}

	@Override
	public String description() {
		return decoratedShape.description() + " drawn with thickness " + thickness;
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}

}
