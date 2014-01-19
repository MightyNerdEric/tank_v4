package a4.actionobject;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import a4.GameWorld;

public class FireGrenadeCommand extends AbstractAction {
	private GameWorld gw;
	
	public FireGrenadeCommand(GameWorld gw) {
		this.gw = gw;
	}

	public void actionPerformed(ActionEvent arg0) {
		if (gw != null) {
			if (!gw.isPaused())
				gw.firePlayerGrenade();
		}
		else System.out.println("Something went wrong.");
	}

}
