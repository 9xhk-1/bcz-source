package com.baicizhan.app.biz.auth;

import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.common.Constants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f13725a = new a();

        @Override // com.baicizhan.app.biz.auth.m
        public int a() {
            return 0;
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 354721571;
        }

        @m80.k
        public String toString() {
            return CommonConstant.RETKEY.EMAIL;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f13726a = new b();

        @Override // com.baicizhan.app.biz.auth.m
        public int a() {
            return 7;
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1795244256;
        }

        @m80.k
        public String toString() {
            return SystemUtils.PRODUCT_HUAWEI;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f13727a = new c();

        @Override // com.baicizhan.app.biz.auth.m
        public int a() {
            return 6;
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 365730037;
        }

        @m80.k
        public String toString() {
            return "Phone";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final d f13728a = new d();

        @Override // com.baicizhan.app.biz.auth.m
        public int a() {
            return 5;
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -951797799;
        }

        @m80.k
        public String toString() {
            return Constants.SOURCE_QQ;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final e f13729a = new e();

        @Override // com.baicizhan.app.biz.auth.m
        public int a() {
            return 3;
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 559043330;
        }

        @m80.k
        public String toString() {
            return "Try";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements m {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final f f13730a = new f();

        @Override // com.baicizhan.app.biz.auth.m
        public int a() {
            return 4;
        }

        public boolean equals(@m80.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1380538273;
        }

        @m80.k
        public String toString() {
            return "WECHAT";
        }
    }

    int a();
}
