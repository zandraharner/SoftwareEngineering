package withDecorator;

public class LineStyleDecorator extends ShapeDecorator {
	
	protected LineStyle linestyle;

	public LineStyleDecorator(Shape decoratedShape, LineStyle linestyle) {
		super(decoratedShape);
		this.linestyle = linestyle;
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line Style: " + linestyle);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
		
	}

	@Override
	public String description() {
		return decoratedShape.description() + " drawn with " + linestyle + " lines"; 
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}

}
