
public class GumballMachineTestDrive {
	public static void main(String[] args)

	{
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}

}

class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

	State state;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		state = soldOutState;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot");
		if (count != 0) {
			count = count - 1;
		}
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;

	}

	public int getCount() {

		return count;
	}

	public State getSoldOutState() {

		return soldOutState;
	}

}

class HasQuarterState implements State {

	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {

		System.out.println("you can’t insert another quarter");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");

	}

}

class NoQuarterState implements State {

	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {

		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());

	}

	class SoldOutState implements State {

		GumballMachine gumballMachine;

		public SoldOutState(GumballMachine gumballMachine) {
			this.gumballMachine = gumballMachine;
		}

		@Override
		public void insertQuarter() {

			System.out.println("You can’t insert a quarter, the machine is sold out");

		}

		@Override
		public void turnCrank() {
			System.out.println("You turned, but there are no gumballs");

		}

		@Override
		public void ejectQuarter() {
			System.out.println("You can’t eject, you haven’t inserted a quarter yet");

		}

		@Override
		public void dispense() {
			System.out.println("No gumball dispensed");

		}

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there’s no quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven’t inserted a quarter");

	}

	@Override
	public void dispense() {
		System.out.println("You need to pay First");

	}

}

class SoldState implements State {

	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we’re already giving you a gumball");

	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn’t get you another gumball!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");

	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());

		} else {
			System.out.println("Oops,out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}

class SoldOutState implements State {

	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {

		System.out.println("You can’t insert a quarter, the machine is sold out");

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can’t eject, you haven’t inserted a quarter yet");

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");

	}

}

interface State {
	public void insertQuarter();

	public void turnCrank();

	public void ejectQuarter();

	public void dispense();

}
