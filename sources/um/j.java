package um;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f92333a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f92334b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f92335c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f92336d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f92337e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h hVar, p<? super Composer, ? super Integer, g2> pVar, p<? super Composer, ? super Integer, g2> pVar2, p<? super Composer, ? super Integer, g2> pVar3, int i11) {
            super(2);
            this.f92333a = hVar;
            this.f92334b = pVar;
            this.f92335c = pVar2;
            this.f92336d = pVar3;
            this.f92337e = i11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            j.a(this.f92333a, this.f92334b, this.f92335c, this.f92336d, composer, this.f92337e | 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ um.b f92338a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f92339b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f92340c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f92341d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f92342e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(um.b bVar, p<? super Composer, ? super Integer, g2> pVar, p<? super Composer, ? super Integer, g2> pVar2, p<? super Composer, ? super Integer, g2> pVar3, int i11) {
            super(2);
            this.f92338a = bVar;
            this.f92339b = pVar;
            this.f92340c = pVar2;
            this.f92341d = pVar3;
            this.f92342e = i11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            j.b(this.f92338a, this.f92339b, this.f92340c, this.f92341d, composer, this.f92342e | 1);
        }
    }

    @Composable
    @um.a
    public static final void a(@m80.k h permissionState, @m80.k p<? super Composer, ? super Integer, g2> permissionNotGrantedContent, @m80.k p<? super Composer, ? super Integer, g2> permissionNotAvailableContent, @m80.k p<? super Composer, ? super Integer, g2> content, @m80.l Composer composer, int i11) {
        int i12;
        g0.p(permissionState, "permissionState");
        g0.p(permissionNotGrantedContent, "permissionNotGrantedContent");
        g0.p(permissionNotAvailableContent, "permissionNotAvailableContent");
        g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1887264609);
        if ((i11 & 14) == 0) {
            i12 = (startRestartGroup.changed(permissionState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= startRestartGroup.changed(permissionNotGrantedContent) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= startRestartGroup.changed(permissionNotAvailableContent) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= startRestartGroup.changed(content) ? 2048 : 1024;
        }
        if (((i12 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (permissionState.d()) {
            startRestartGroup.startReplaceableGroup(1887264886);
            content.invoke(startRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
        } else if (permissionState.a() || !permissionState.b()) {
            startRestartGroup.startReplaceableGroup(1887265007);
            permissionNotGrantedContent.invoke(startRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(1887265077);
            permissionNotAvailableContent.invoke(startRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new a(permissionState, permissionNotGrantedContent, permissionNotAvailableContent, content, i11));
    }

    @Composable
    @um.a
    public static final void b(@m80.k um.b multiplePermissionsState, @m80.k p<? super Composer, ? super Integer, g2> permissionsNotGrantedContent, @m80.k p<? super Composer, ? super Integer, g2> permissionsNotAvailableContent, @m80.k p<? super Composer, ? super Integer, g2> content, @m80.l Composer composer, int i11) {
        int i12;
        g0.p(multiplePermissionsState, "multiplePermissionsState");
        g0.p(permissionsNotGrantedContent, "permissionsNotGrantedContent");
        g0.p(permissionsNotAvailableContent, "permissionsNotAvailableContent");
        g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2104183839);
        if ((i11 & 14) == 0) {
            i12 = (startRestartGroup.changed(multiplePermissionsState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= startRestartGroup.changed(permissionsNotGrantedContent) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= startRestartGroup.changed(permissionsNotAvailableContent) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= startRestartGroup.changed(content) ? 2048 : 1024;
        }
        if (((i12 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else if (multiplePermissionsState.f()) {
            startRestartGroup.startReplaceableGroup(2104184154);
            content.invoke(startRestartGroup, Integer.valueOf((i12 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
        } else if (multiplePermissionsState.a() || !multiplePermissionsState.b()) {
            startRestartGroup.startReplaceableGroup(2104184317);
            permissionsNotGrantedContent.invoke(startRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(2104184396);
            permissionsNotAvailableContent.invoke(startRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new b(multiplePermissionsState, permissionsNotGrantedContent, permissionsNotAvailableContent, content, i11));
    }
}
