package com.getui.gtc.base.log.d;

import com.getui.gtc.base.log.ILogController;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final List<ILogController> f29821a = new ArrayList();

    @Override // com.getui.gtc.base.log.d.a
    public final void a(int i11, String str, String str2, Throwable th2) {
        for (ILogController iLogController : this.f29821a) {
            try {
                if (iLogController.isLoggable(i11, str)) {
                    iLogController.log(i11, str, str2, th2);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    @Override // com.getui.gtc.base.log.d.a
    public final void b(ILogController iLogController) {
        if (this.f29821a.contains(iLogController)) {
            this.f29821a.remove(iLogController);
        }
    }

    @Override // com.getui.gtc.base.log.d.a
    public final void a(ILogController iLogController) {
        if (iLogController == null) {
            return;
        }
        this.f29821a.add(iLogController);
    }
}
