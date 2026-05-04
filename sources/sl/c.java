package sl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fm.openinstall.model.AppData;

/* loaded from: classes6.dex */
public abstract class c implements b {
    @Override // sl.b
    public void a(@Nullable AppData appData, @Nullable tl.a aVar) {
        if (appData == null) {
            appData = new AppData();
        }
        b(appData, aVar != null && aVar.a() == -4);
    }

    public abstract void b(@NonNull AppData appData, boolean z11);
}
