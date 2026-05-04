package com.baicizhan.app.biz.auth;

import com.huawei.hms.android.SystemUtils;
import com.tencent.connect.common.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface q {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f13744a = new a();

        @Override // com.baicizhan.app.biz.auth.q
        @m80.k
        public String a() {
            return "huawei";
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1620450198;
        }

        @m80.k
        public String toString() {
            return SystemUtils.PRODUCT_HUAWEI;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f13745a = new b();

        @Override // com.baicizhan.app.biz.auth.q
        @m80.k
        public String a() {
            return "phone";
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1740843585;
        }

        @m80.k
        public String toString() {
            return "Phone";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f13746a = new c();

        @Override // com.baicizhan.app.biz.auth.q
        @m80.k
        public String a() {
            return "qq";
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -2085044401;
        }

        @m80.k
        public String toString() {
            return Constants.SOURCE_QQ;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final d f13747a = new d();

        @Override // com.baicizhan.app.biz.auth.q
        @m80.k
        public String a() {
            return "weibo";
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1735459527;
        }

        @m80.k
        public String toString() {
            return "WEIBO";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements q {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final e f13748a = new e();

        @Override // com.baicizhan.app.biz.auth.q
        @m80.k
        public String a() {
            return "weixin";
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 2035350545;
        }

        @m80.k
        public String toString() {
            return "WEIXIN";
        }
    }

    @m80.k
    String a();
}
