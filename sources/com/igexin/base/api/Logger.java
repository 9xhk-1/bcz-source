package com.igexin.base.api;

import android.text.TextUtils;
import com.igexin.base.a.a;
import com.igexin.base.a.c;

/* loaded from: classes7.dex */
public final class Logger implements a {
    private a mBase;

    public static class Builder {
        private c mLog = new c();

        public Logger build() {
            return new Logger(this.mLog);
        }

        public Builder enableLog(boolean z11) {
            this.mLog.enableLog(z11);
            return this;
        }

        public Builder setPath(String str) {
            if (TextUtils.isEmpty(str)) {
                throw null;
            }
            this.mLog.f37052f = str;
            return this;
        }

        public Builder setPeriodicCondition(int i11, long j11) {
            c cVar = this.mLog;
            int max = Math.max(0, i11);
            long max2 = Math.max(0L, j11);
            cVar.f37048b = max;
            cVar.f37049c = max2;
            return this;
        }

        public Builder setRc4Key(String str) {
            if (!TextUtils.isEmpty(str) && com.igexin.base.util.a.a.a(str.getBytes())) {
                this.mLog.f37051e = str;
            }
            return this;
        }
    }

    private Logger(a aVar) {
        this.mBase = aVar;
    }

    @Override // com.igexin.base.a.a
    public final void enableLog(boolean z11) {
        this.mBase.enableLog(z11);
    }

    @Override // com.igexin.base.a.a
    public final boolean isEnabled() {
        return this.mBase.isEnabled();
    }

    @Override // com.igexin.base.a.a
    public final void log(String str) {
        this.mBase.log(str);
    }
}
