package withDecorator;

/*
 * I kept this abstract to avoid any direct instantiation since this is just a wrapper 
 * and does not add any functionality into the shape. 
 * Also, I have implemented Shape to allow adding additional functionalities to all of the defined, 
 * concrete Shape classes — Circle and Rectangle — for this case.
 * */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}
}
