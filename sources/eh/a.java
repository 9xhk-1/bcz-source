package eh;

import com.baicizhan.main.operate.share_code.ButtonInfo;
import m80.l;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {
    public static final boolean a(@l ButtonInfo buttonInfo) {
        String text;
        return (buttonInfo == null || (text = buttonInfo.getText()) == null || k0.O3(text)) ? false : true;
    }

    public static final boolean b(@l ButtonInfo buttonInfo) {
        String text;
        String action;
        return (buttonInfo == null || (text = buttonInfo.getText()) == null || k0.O3(text) || (action = buttonInfo.getAction()) == null || k0.O3(action)) ? false : true;
    }
}
