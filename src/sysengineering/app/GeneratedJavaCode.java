package sysengineering.app;



public class GeneratedJavaCode {

	public static void main(String[] args) {
	      for(Object arg : args) {
	          if (arg instanceof String) {
	             String e = (String) arg;
	             Event evt = new Event(e.toString());
	             handleEvent(evt);
	          }
	       }
	    }

	    static enum State {
	     FIRST, SECOND, THIRD
	    }

	    static State state = State.FIRST;

	    static void handleEvent(Event evt) {
	       switch (state) {
	          case FIRST:
	             if (evt.id.equals("KEY_PRESSED")) {
	                state = State.SECOND;
	                System.out.println(state);
	             }
	             break;
	          case SECOND:
	             if (evt.id.equals("KEY_PRESSED")) {
	                state = State.THIRD;
	                System.out.println(state);
	             }
	             break;
	          case THIRD:
	             if (evt.id.equals("KEY_PRESSED")) {
	                state = State.FIRST;
	                System.out.println(state);
	             }
	             break;
	       }
	    }

	 }

	 class Event {
	    String id;
	    public Event(String id) {
	       this.id = id;
	    }
		
		

	}


