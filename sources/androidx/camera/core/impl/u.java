package androidx.camera.core.impl;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final /* synthetic */ class u {
    public static /* synthetic */ String a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException(TtmlNode.RUBY_DELIMITER);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
