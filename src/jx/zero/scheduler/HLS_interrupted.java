
package jx.zero.scheduler;

import jx.zero.CPUState;

/**
this interface defines a Notifying-Method of a HighLevel_Scheduler 
*/
public interface HLS_interrupted{

/* y/n *//* specifies wether the IRQs are disabled or not */

             /** A thread was interrupted. <BR>
		 the Scheduler may activate it again immediately or<BR>
		 store the thread for later execution <BR>
	         <B>! IRQ are disabled during execution of this method</B><BR> */
/* yes */    public void interrupted(CPUState newThread);

}
