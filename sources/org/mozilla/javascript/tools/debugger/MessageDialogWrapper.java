package org.mozilla.javascript.tools.debugger;

import java.awt.Component;
import javax.swing.JOptionPane;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class MessageDialogWrapper {
    public static void showMessageDialog(Component component, String str, String str2, int i11) {
        if (str.length() > 60) {
            StringBuffer stringBuffer = new StringBuffer();
            int length = str.length();
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                char charAt = str.charAt(i12);
                stringBuffer.append(charAt);
                if (Character.isWhitespace(charAt)) {
                    int i14 = i12 + 1;
                    while (i14 < length && !Character.isWhitespace(str.charAt(i14))) {
                        i14++;
                    }
                    if (i14 < length && (i14 - i12) + i13 > 60) {
                        stringBuffer.append('\n');
                        i13 = 0;
                    }
                }
                i12++;
                i13++;
            }
            str = stringBuffer.toString();
        }
        JOptionPane.showMessageDialog(component, str, str2, i11);
    }
}
