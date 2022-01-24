package dwcjsample;

import org.dwcj.App;
import org.dwcj.controls.Button;
import org.dwcj.events.ButtonPushEvent;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class SampleApp extends App{

	@Override
	public void run() throws DwcAppInitializeException {
		
//		AppPanel panel = new AppPanel();
//		Button btn = new Button("Push me !");
//		panel.add(btn);
//		btn.onClick(this::onButtonPush);
//		btn.setTheme	(btn.THEME_SUCCESS); //enum
//		btn.setExpanse	(btn.EXPANSE_XLARGE);		
		
		new SampleAppPanel();
	}

	private void onButtonPush(ButtonPushEvent buttonpushevent1) {
		App.msgbox("Hello");
	}

}
