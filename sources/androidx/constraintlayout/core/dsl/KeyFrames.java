package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class KeyFrames {
    ArrayList<Keys> mKeys = new ArrayList<>();

    public void add(Keys keys) {
        this.mKeys.add(keys);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.mKeys.isEmpty()) {
            sb2.append("keyFrames:{\n");
            Iterator<Keys> it = this.mKeys.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        return sb2.toString();
    }
}
