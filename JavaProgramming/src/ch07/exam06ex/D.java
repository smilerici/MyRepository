package ch07.exam06ex;

import ch07.exam06.*;

public class D extends A{
	
		public D() {
			super();
			this.field = "value";
			this.method();
		}
		
		public void method() {
		
			this.field = "value";
			this.method();
		}
		
	
	}

