package dd;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.baicizhan.client.business.managers.experience.data.db.EXPDb;
import com.baicizhan.client.business.managers.experience.data.remote.ExpImpl;
import com.baicizhan.client.business.managers.experience.data.remote.TaskImpl;
import com.baicizhan.client.business.managers.winningstreak.WinningStreakImpl;
import com.baicizhan.client.business.webview.ui.BczWebActivity;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.baicizhan.client.business.webview.ui.BczWebFragment_MembersInjector;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import com.baicizhan.main.BaicizhanApp;
import com.baicizhan.main.activity.FastTestActivity;
import com.baicizhan.main.activity.LearningActivity;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.daka.dakapage.DakaActivity;
import com.baicizhan.main.activity.daka.datasource.DakaRepoImpl;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusActivityDialog;
import com.baicizhan.main.activity.lookup.LookupWordActivity;
import com.baicizhan.main.activity.mytab.MyTabFragment;
import com.baicizhan.main.activity.mytab.device.MyDeviceVM;
import com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl;
import com.baicizhan.main.activity.mytab.device.g;
import com.baicizhan.main.activity.mytab.task.TaskVM;
import com.baicizhan.main.activity.mytab.task.data.CacheAchievementRepo;
import com.baicizhan.main.activity.mytab.task.data.CachedTasksRepository;
import com.baicizhan.main.activity.mytab.task.domain.DoReceiveAwardUC;
import com.baicizhan.main.activity.mytab.task.m;
import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.b2;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.e2;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.f2;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.g;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.h2;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.x0;
import com.baicizhan.main.activity.schedule_v2.adjustschedule.y1;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.RemoteMultiModeRepo;
import com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC;
import com.baicizhan.main.activity.schedule_v2.mutimode.j0;
import com.baicizhan.main.activity.schedule_v2.mutimode.m0;
import com.baicizhan.main.activity.schedule_v2.mutimode.n0;
import com.baicizhan.main.activity.schedule_v2.mutimode.p0;
import com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment;
import com.baicizhan.main.activity.schedule_v2.switchschedule.f0;
import com.baicizhan.main.activity.schedule_v2.switchschedule.h0;
import com.baicizhan.main.activity.schedule_v2.switchschedule.i0;
import com.baicizhan.main.activity.schedule_v2.switchschedule.k0;
import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import com.baicizhan.main.home.experiment.HomeActivity;
import com.baicizhan.main.home.experiment.p3;
import com.baicizhan.main.home.experiment.p5;
import com.baicizhan.main.home.experiment.repo.c0;
import com.baicizhan.main.home.experiment.repo.x;
import com.baicizhan.main.home.experiment.s5;
import com.baicizhan.main.home.experiment.t5;
import com.baicizhan.main.home.experiment.v5;
import com.baicizhan.main.home.plan.WordPlanFragment;
import com.baicizhan.main.home.plan.allinone.AllInOneVM;
import com.baicizhan.main.home.plan.allinone.HomeRepo;
import com.baicizhan.main.home.plan.allinone.d;
import com.baicizhan.main.home.plan.allinone.e1;
import com.baicizhan.main.home.plan.allinone.g1;
import com.baicizhan.main.home.plan.allinone.i1;
import com.baicizhan.main.home.plan.newexam.ExamVM;
import com.baicizhan.main.home.plan.newexam.f2;
import com.baicizhan.main.home.plan.newexam.g2;
import com.baicizhan.main.home.plan.newexam.i2;
import com.baicizhan.main.home.plan.o1;
import com.baicizhan.main.plusreview.activity.DefaultReviewActivity;
import com.baicizhan.main.selftest.activity.WalkListenActivity;
import com.baicizhan.main.wikiv2.activity.WikiPagerActivity;
import com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneActivity;
import com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneFragment;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.baicizhan.main.wikiv2.lookup.wikiv2.q0;
import com.baicizhan.main.wikiv2.lookup.wikiv2.r0;
import com.baicizhan.main.wikiv2.lookup.wikiv2.t0;
import com.baicizhan.main.wordlistv2.WordListV2Activity;
import com.baicizhan.main.wordlistv2.repo.RemoteImpl;
import com.baicizhan.main.wordlistv2.repo.WordResRepoImpl;
import com.baicizhan.main.wordlistv2.repo.db.WordListDb;
import com.baicizhan.main.wordlistv2.repo.r;
import com.baicizhan.main.wordlistv2.w0;
import com.baicizhan.main.wordlistv2.y0;
import com.baicizhan.main.wordlistv2.z0;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import dagger.hilt.android.internal.lifecycle.a;
import dd.f;
import fd.s1;
import fd.w2;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import k3.j3;
import od.p;
import oe.b1;
import q9.u;
import q9.v;
import qg.l0;
import qg.q0;
import qg.s0;
import sg.a0;
import sg.b0;
import sg.d0;
import tv.s;
import tv.t;
import wg.q;
import wg.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.e
/* loaded from: classes4.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements f.a.InterfaceC0565a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47833a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47834b;

        /* renamed from: c, reason: collision with root package name */
        public Activity f47835c;

        @Override // uu.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Activity activity) {
            this.f47835c = (Activity) s.b(activity);
            return this;
        }

        @Override // uu.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f.a build() {
            s.a(this.f47835c, Activity.class);
            return new b(this.f47833a, this.f47834b, this.f47835c);
        }

        public a(j singletonCImpl, d activityRetainedCImpl) {
            this.f47833a = singletonCImpl;
            this.f47834b = activityRetainedCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements f.c.a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47839a;

        /* renamed from: b, reason: collision with root package name */
        public xu.l f47840b;

        @Override // uu.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.c build() {
            s.a(this.f47840b, xu.l.class);
            return new d(this.f47839a, this.f47840b);
        }

        @Override // uu.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c a(xu.l savedStateHandleHolder) {
            this.f47840b = (xu.l) s.b(savedStateHandleHolder);
            return this;
        }

        public c(j singletonCImpl) {
            this.f47839a = singletonCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends f.c {

        /* renamed from: a, reason: collision with root package name */
        public final j f47841a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47842b = this;

        /* renamed from: c, reason: collision with root package name */
        public t<qu.a> f47843c;

        /* renamed from: d, reason: collision with root package name */
        public t<b1> f47844d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<T> implements t<T> {

            /* renamed from: a, reason: collision with root package name */
            public final j f47845a;

            /* renamed from: b, reason: collision with root package name */
            public final d f47846b;

            /* renamed from: c, reason: collision with root package name */
            public final int f47847c;

            public a(j singletonCImpl, d activityRetainedCImpl, int id2) {
                this.f47845a = singletonCImpl;
                this.f47846b = activityRetainedCImpl;
                this.f47847c = id2;
            }

            @Override // javax.inject.Provider, vz.c
            public T get() {
                int i11 = this.f47847c;
                if (i11 == 0) {
                    return (T) xu.c.c();
                }
                if (i11 == 1) {
                    return (T) new b1();
                }
                throw new AssertionError(this.f47847c);
            }
        }

        public d(j singletonCImpl, xu.l savedStateHandleHolderParam) {
            this.f47841a = singletonCImpl;
            c(savedStateHandleHolderParam);
        }

        @Override // xu.a.InterfaceC1328a
        public uu.a a() {
            return new a(this.f47841a, this.f47842b);
        }

        @Override // xu.b.d
        public qu.a b() {
            return this.f47843c.get();
        }

        public final void c(final xu.l savedStateHandleHolderParam) {
            this.f47843c = tv.g.e(new a(this.f47841a, this.f47842b, 0));
            this.f47844d = tv.g.e(new a(this.f47841a, this.f47842b, 1));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public zu.c f47848a;

        public e a(zu.c applicationContextModule) {
            this.f47848a = (zu.c) s.b(applicationContextModule);
            return this;
        }

        public f.i b() {
            s.a(this.f47848a, zu.c.class);
            return new j(this.f47848a);
        }

        public e() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements f.e.a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47849a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47850b;

        /* renamed from: c, reason: collision with root package name */
        public final b f47851c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f47852d;

        @Override // uu.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.e build() {
            s.a(this.f47852d, Fragment.class);
            return new g(this.f47849a, this.f47850b, this.f47851c, this.f47852d);
        }

        @Override // uu.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f a(Fragment fragment) {
            this.f47852d = (Fragment) s.b(fragment);
            return this;
        }

        public f(j singletonCImpl, d activityRetainedCImpl, b activityCImpl) {
            this.f47849a = singletonCImpl;
            this.f47850b = activityRetainedCImpl;
            this.f47851c = activityCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements f.g.a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47857a;

        /* renamed from: b, reason: collision with root package name */
        public Service f47858b;

        @Override // uu.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.g build() {
            s.a(this.f47858b, Service.class);
            return new C0567i(this.f47857a, this.f47858b);
        }

        @Override // uu.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h a(Service service) {
            this.f47858b = (Service) s.b(service);
            return this;
        }

        public h(j singletonCImpl) {
            this.f47857a = singletonCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dd.i$i, reason: collision with other inner class name */
    public static final class C0567i extends f.g {

        /* renamed from: a, reason: collision with root package name */
        public final j f47859a;

        /* renamed from: b, reason: collision with root package name */
        public final C0567i f47860b = this;

        public C0567i(j singletonCImpl, Service serviceParam) {
            this.f47859a = singletonCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements f.j.a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47889a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47890b;

        /* renamed from: c, reason: collision with root package name */
        public final b f47891c;

        /* renamed from: d, reason: collision with root package name */
        public View f47892d;

        @Override // uu.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.j build() {
            s.a(this.f47892d, View.class);
            return new l(this.f47889a, this.f47890b, this.f47891c, this.f47892d);
        }

        @Override // uu.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public k a(View view) {
            this.f47892d = (View) s.b(view);
            return this;
        }

        public k(j singletonCImpl, d activityRetainedCImpl, b activityCImpl) {
            this.f47889a = singletonCImpl;
            this.f47890b = activityRetainedCImpl;
            this.f47891c = activityCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends f.j {

        /* renamed from: a, reason: collision with root package name */
        public final j f47893a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47894b;

        /* renamed from: c, reason: collision with root package name */
        public final b f47895c;

        /* renamed from: d, reason: collision with root package name */
        public final l f47896d = this;

        public l(j singletonCImpl, d activityRetainedCImpl, b activityCImpl, View viewParam) {
            this.f47893a = singletonCImpl;
            this.f47894b = activityRetainedCImpl;
            this.f47895c = activityCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m implements f.l.a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47897a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47898b;

        /* renamed from: c, reason: collision with root package name */
        public SavedStateHandle f47899c;

        /* renamed from: d, reason: collision with root package name */
        public qu.i f47900d;

        @Override // uu.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f.l build() {
            s.a(this.f47899c, SavedStateHandle.class);
            s.a(this.f47900d, qu.i.class);
            return new n(this.f47897a, this.f47898b, this.f47899c, this.f47900d);
        }

        @Override // uu.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public m b(SavedStateHandle handle) {
            this.f47899c = (SavedStateHandle) s.b(handle);
            return this;
        }

        @Override // uu.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public m a(qu.i viewModelLifecycle) {
            this.f47900d = (qu.i) s.b(viewModelLifecycle);
            return this;
        }

        public m(j singletonCImpl, d activityRetainedCImpl) {
            this.f47897a = singletonCImpl;
            this.f47898b = activityRetainedCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends f.l {

        /* renamed from: a, reason: collision with root package name */
        public final j f47901a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47902b;

        /* renamed from: c, reason: collision with root package name */
        public final n f47903c = this;

        /* renamed from: d, reason: collision with root package name */
        public t<com.baicizhan.main.activity.schedule_v2.adjustschedule.e> f47904d;

        /* renamed from: e, reason: collision with root package name */
        public t<AllInOneVM> f47905e;

        /* renamed from: f, reason: collision with root package name */
        public t<od.n> f47906f;

        /* renamed from: g, reason: collision with root package name */
        public t<ExamVM> f47907g;

        /* renamed from: h, reason: collision with root package name */
        public t<b2> f47908h;

        /* renamed from: i, reason: collision with root package name */
        public t<j0> f47909i;

        /* renamed from: j, reason: collision with root package name */
        public t<MyDeviceVM> f47910j;

        /* renamed from: k, reason: collision with root package name */
        public t<q> f47911k;

        /* renamed from: l, reason: collision with root package name */
        public t<f0> f47912l;

        /* renamed from: m, reason: collision with root package name */
        public t<TaskVM> f47913m;

        /* renamed from: n, reason: collision with root package name */
        public t<o0> f47914n;

        /* renamed from: o, reason: collision with root package name */
        public t<com.baicizhan.main.home.plan.winningStreak.e> f47915o;

        /* renamed from: p, reason: collision with root package name */
        public t<w0> f47916p;

        /* renamed from: q, reason: collision with root package name */
        public t<p5> f47917q;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<T> implements t<T> {

            /* renamed from: a, reason: collision with root package name */
            public final j f47918a;

            /* renamed from: b, reason: collision with root package name */
            public final d f47919b;

            /* renamed from: c, reason: collision with root package name */
            public final n f47920c;

            /* renamed from: d, reason: collision with root package name */
            public final int f47921d;

            public a(j singletonCImpl, d activityRetainedCImpl, n viewModelCImpl, int id2) {
                this.f47918a = singletonCImpl;
                this.f47919b = activityRetainedCImpl;
                this.f47920c = viewModelCImpl;
                this.f47921d = id2;
            }

            @Override // javax.inject.Provider, vz.c
            public T get() {
                switch (this.f47921d) {
                    case 0:
                        return (T) new com.baicizhan.main.activity.schedule_v2.adjustschedule.e(this.f47919b.f47844d.get(), zu.d.c(this.f47918a.f47861a), this.f47920c.h(), this.f47918a.f47879s.get(), this.f47918a.f47877q.get());
                    case 1:
                        return (T) new AllInOneVM(this.f47918a.C.get(), v.c(), this.f47918a.f47879s.get());
                    case 2:
                        return (T) od.o.c(zu.e.c(this.f47918a.f47861a), this.f47918a.f47868h.get(), u.c(), this.f47918a.f47873m.get());
                    case 3:
                        return (T) new ExamVM(this.f47920c.c(), this.f47920c.i(), this.f47918a.f47881u.get(), this.f47918a.t());
                    case 4:
                        return (T) new b2(this.f47919b.f47844d.get(), zu.d.c(this.f47918a.f47861a), this.f47920c.l());
                    case 5:
                        return (T) new j0(this.f47920c.j(), this.f47918a.E.get(), this.f47920c.l());
                    case 6:
                        return (T) new MyDeviceVM(this.f47918a.G.get());
                    case 7:
                        return (T) new q(zu.d.c(this.f47918a.f47861a), this.f47918a.f47877q.get(), this.f47918a.I.get());
                    case 8:
                        return (T) new f0(zu.d.c(this.f47918a.f47861a), this.f47920c.l(), this.f47920c.h(), this.f47918a.f47879s.get(), this.f47918a.f47877q.get());
                    case 9:
                        return (T) new TaskVM(this.f47918a.K.get(), this.f47918a.M.get(), this.f47920c.f(), this.f47920c.d(), this.f47920c.g());
                    case 10:
                        return (T) new o0(zu.d.c(this.f47918a.f47861a), this.f47918a.N.get(), this.f47918a.O.get());
                    case 11:
                        return (T) new com.baicizhan.main.home.plan.winningStreak.e(this.f47918a.f47868h.get(), this.f47918a.f47865e.get(), this.f47918a.f47873m.get(), this.f47918a.t());
                    case 12:
                        return (T) new w0(this.f47918a.W.get());
                    case 13:
                        return (T) new p5(this.f47918a.f47865e.get(), this.f47918a.f47877q.get(), this.f47920c.m(), this.f47920c.e(), this.f47918a.f47863c.get());
                    default:
                        throw new AssertionError(this.f47921d);
                }
            }
        }

        public n(j singletonCImpl, d activityRetainedCImpl, SavedStateHandle savedStateHandleParam, qu.i viewModelLifecycleParam) {
            this.f47901a = singletonCImpl;
            this.f47902b = activityRetainedCImpl;
            k(savedStateHandleParam, viewModelLifecycleParam);
        }

        @Override // dagger.hilt.android.internal.lifecycle.d.InterfaceC0554d
        public Map<Class<?>, Provider<ViewModel>> a() {
            return tv.n.b(ImmutableMap.builderWithExpectedSize(14).i(com.baicizhan.main.activity.schedule_v2.adjustschedule.h.f19121b, this.f47904d).i(com.baicizhan.main.home.plan.allinone.e.f22155b, this.f47905e).i(od.q.f76835b, this.f47906f).i(g2.f22677b, this.f47907g).i(f2.f19116b, this.f47908h).i(n0.f19399b, this.f47909i).i(com.baicizhan.main.activity.mytab.device.h.f18633b, this.f47910j).i(wg.t.f96354b, this.f47911k).i(i0.f19516b, this.f47912l).i(com.baicizhan.main.activity.mytab.task.n.f18859b, this.f47913m).i(r0.f25722b, this.f47914n).i(b0.f88451b, this.f47915o).i(z0.f28132b, this.f47916p).i(t5.f21679b, this.f47917q).a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.d.InterfaceC0554d
        public Map<Class<?>, Object> b() {
            return ImmutableMap.of();
        }

        public qg.a c() {
            return new qg.a(this.f47901a.f47883w.get());
        }

        public DoReceiveAwardUC d() {
            return new DoReceiveAwardUC(this.f47901a.M.get());
        }

        public com.baicizhan.main.home.experiment.repo.j e() {
            return new com.baicizhan.main.home.experiment.repo.j(this.f47901a.f47877q.get());
        }

        public com.baicizhan.main.activity.mytab.task.domain.b f() {
            return new com.baicizhan.main.activity.mytab.task.domain.b(this.f47901a.K.get(), this.f47901a.M.get());
        }

        public com.baicizhan.main.activity.mytab.task.domain.d g() {
            return new com.baicizhan.main.activity.mytab.task.domain.d(this.f47901a.M.get());
        }

        public q0 h() {
            return new q0(this.f47901a.f47883w.get());
        }

        public s0 i() {
            return new s0(this.f47901a.f47883w.get());
        }

        public GetSelectModeListUC j() {
            return new GetSelectModeListUC(this.f47901a.E.get());
        }

        public final void k(final SavedStateHandle savedStateHandleParam, final qu.i viewModelLifecycleParam) {
            this.f47904d = new a(this.f47901a, this.f47902b, this.f47903c, 0);
            this.f47905e = new a(this.f47901a, this.f47902b, this.f47903c, 1);
            this.f47906f = new a(this.f47901a, this.f47902b, this.f47903c, 2);
            this.f47907g = new a(this.f47901a, this.f47902b, this.f47903c, 3);
            this.f47908h = new a(this.f47901a, this.f47902b, this.f47903c, 4);
            this.f47909i = new a(this.f47901a, this.f47902b, this.f47903c, 5);
            this.f47910j = new a(this.f47901a, this.f47902b, this.f47903c, 6);
            this.f47911k = new a(this.f47901a, this.f47902b, this.f47903c, 7);
            this.f47912l = new a(this.f47901a, this.f47902b, this.f47903c, 8);
            this.f47913m = new a(this.f47901a, this.f47902b, this.f47903c, 9);
            this.f47914n = new a(this.f47901a, this.f47902b, this.f47903c, 10);
            this.f47915o = new a(this.f47901a, this.f47902b, this.f47903c, 11);
            this.f47916p = new a(this.f47901a, this.f47902b, this.f47903c, 12);
            this.f47917q = new a(this.f47901a, this.f47902b, this.f47903c, 13);
        }

        public ta.b l() {
            return new ta.b(zu.d.c(this.f47901a.f47861a));
        }

        public x m() {
            return new x(this.f47901a.f47877q.get(), this.f47901a.f47865e.get(), this.f47901a.f47868h.get(), v.c(), this.f47901a.I.get());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o implements f.n.a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47922a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47923b;

        /* renamed from: c, reason: collision with root package name */
        public final b f47924c;

        /* renamed from: d, reason: collision with root package name */
        public final g f47925d;

        /* renamed from: e, reason: collision with root package name */
        public View f47926e;

        @Override // uu.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.n build() {
            s.a(this.f47926e, View.class);
            return new p(this.f47922a, this.f47923b, this.f47924c, this.f47925d, this.f47926e);
        }

        @Override // uu.g
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o a(View view) {
            this.f47926e = (View) s.b(view);
            return this;
        }

        public o(j singletonCImpl, d activityRetainedCImpl, b activityCImpl, g fragmentCImpl) {
            this.f47922a = singletonCImpl;
            this.f47923b = activityRetainedCImpl;
            this.f47924c = activityCImpl;
            this.f47925d = fragmentCImpl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p extends f.n {

        /* renamed from: a, reason: collision with root package name */
        public final j f47927a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47928b;

        /* renamed from: c, reason: collision with root package name */
        public final b f47929c;

        /* renamed from: d, reason: collision with root package name */
        public final g f47930d;

        /* renamed from: e, reason: collision with root package name */
        public final p f47931e = this;

        public p(j singletonCImpl, d activityRetainedCImpl, b activityCImpl, g fragmentCImpl, View viewParam) {
            this.f47927a = singletonCImpl;
            this.f47928b = activityRetainedCImpl;
            this.f47929c = activityCImpl;
            this.f47930d = fragmentCImpl;
        }
    }

    public static e a() {
        return new e();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public final j f47836a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47837b;

        /* renamed from: c, reason: collision with root package name */
        public final b f47838c = this;

        public b(j singletonCImpl, d activityRetainedCImpl, Activity activityParam) {
            this.f47836a = singletonCImpl;
            this.f47837b = activityRetainedCImpl;
        }

        @uo.a
        public final LearningActivity A(LearningActivity instance2) {
            s1.c(instance2, this.f47836a.f47868h.get());
            s1.b(instance2, this.f47836a.f47873m.get());
            return instance2;
        }

        @uo.a
        public final MainTabActivity B(MainTabActivity instance3) {
            w2.b(instance3, this.f47836a.f47881u.get());
            return instance3;
        }

        @uo.a
        public final WalkListenActivity C(WalkListenActivity instance8) {
            vh.k.b(instance8, this.f47836a.t());
            return instance8;
        }

        @Override // dagger.hilt.android.internal.lifecycle.a.InterfaceC0553a
        public a.d a() {
            return dagger.hilt.android.internal.lifecycle.b.c(l(), new m(this.f47836a, this.f47837b));
        }

        @Override // jh.f
        public void c(DefaultReviewActivity defaultReviewActivity) {
            w(defaultReviewActivity);
        }

        @Override // fd.v2
        public void d(MainTabActivity mainTabActivity) {
            B(mainTabActivity);
        }

        @Override // xu.p.b
        public uu.e f() {
            return new k(this.f47836a, this.f47837b, this.f47838c);
        }

        @Override // fd.y0
        public void g(FastTestActivity fastTestActivity) {
            y(fastTestActivity);
        }

        @Override // yf.e
        public void i(CollectReviewActivity collectReviewActivity) {
            v(collectReviewActivity);
        }

        @Override // xu.g.a
        public uu.c j() {
            return new f(this.f47836a, this.f47837b, this.f47838c);
        }

        @Override // fd.r1
        public void k(LearningActivity learningActivity) {
            A(learningActivity);
        }

        @Override // dagger.hilt.android.internal.lifecycle.d.c
        public Map<Class<?>, Boolean> l() {
            return tv.n.b(ImmutableMap.builderWithExpectedSize(14).i(com.baicizhan.main.activity.schedule_v2.adjustschedule.j.f19132b, Boolean.valueOf(g.b.a())).i(com.baicizhan.main.home.plan.allinone.g.f22181b, Boolean.valueOf(d.b.a())).i(od.s.f76838b, Boolean.valueOf(p.b.a())).i(i2.f22704b, Boolean.valueOf(f2.b.a())).i(h2.f19126b, Boolean.valueOf(e2.b.a())).i(p0.f19409b, Boolean.valueOf(m0.b.a())).i(com.baicizhan.main.activity.mytab.device.j.f18636b, Boolean.valueOf(g.b.a())).i(wg.v.f96357b, Boolean.valueOf(s.b.a())).i(k0.f19521b, Boolean.valueOf(h0.b.a())).i(com.baicizhan.main.activity.mytab.task.p.f18869b, Boolean.valueOf(m.b.a())).i(t0.f25727b, Boolean.valueOf(q0.b.a())).i(d0.f88460b, Boolean.valueOf(a0.b.a())).i(com.baicizhan.main.wordlistv2.b1.f27844b, Boolean.valueOf(y0.b.a())).i(v5.f21711b, Boolean.valueOf(s5.b.a())).a());
        }

        @Override // com.baicizhan.main.home.experiment.o3
        public void o(HomeActivity homeActivity) {
            z(homeActivity);
        }

        @Override // vh.j
        public void s(WalkListenActivity walkListenActivity) {
            C(walkListenActivity);
        }

        @Override // dagger.hilt.android.internal.lifecycle.d.c
        public uu.f t() {
            return new m(this.f47836a, this.f47837b);
        }

        @Override // oe.q0
        public void u(EditScheduleActivity editScheduleActivity) {
            x(editScheduleActivity);
        }

        @uo.a
        public final CollectReviewActivity v(CollectReviewActivity instance5) {
            yf.f.b(instance5, this.f47836a.f47873m.get());
            return instance5;
        }

        @uo.a
        public final DefaultReviewActivity w(DefaultReviewActivity instance7) {
            jh.g.b(instance7, this.f47836a.f47873m.get());
            return instance7;
        }

        @uo.a
        public final EditScheduleActivity x(EditScheduleActivity instance4) {
            oe.r0.c(instance4, this.f47837b.f47844d.get());
            return instance4;
        }

        @uo.a
        public final FastTestActivity y(FastTestActivity instance) {
            fd.z0.c(instance, this.f47836a.t());
            return instance;
        }

        @uo.a
        public final HomeActivity z(HomeActivity instance6) {
            p3.b(instance6, this.f47836a.f47877q.get());
            return instance6;
        }

        @Override // ab.b
        public void b(AudioCenterActivity audioCenterActivity) {
        }

        @Override // mi.d
        public void e(WikiPagerActivity wikiPagerActivity) {
        }

        @Override // com.baicizhan.main.home.player.n4
        public void h(com.baicizhan.main.home.player.HomeActivity homeActivity) {
        }

        @Override // com.baicizhan.client.business.webview.ui.BczWebActivity_GeneratedInjector
        public void injectBczWebActivity(BczWebActivity bczWebActivity) {
        }

        @Override // od.h
        public void m(DakaActivity dakaActivity) {
        }

        @Override // sd.o
        public void n(BonusActivityDialog bonusActivityDialog) {
        }

        @Override // com.baicizhan.main.wikiv2.lookup.wikiv2.c
        public void p(WikiSceneActivity wikiSceneActivity) {
        }

        @Override // com.baicizhan.main.wordlistv2.u0
        public void q(WordListV2Activity wordListV2Activity) {
        }

        @Override // fe.j
        public void r(LookupWordActivity lookupWordActivity) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final j f47853a;

        /* renamed from: b, reason: collision with root package name */
        public final d f47854b;

        /* renamed from: c, reason: collision with root package name */
        public final b f47855c;

        /* renamed from: d, reason: collision with root package name */
        public final g f47856d = this;

        public g(j singletonCImpl, d activityRetainedCImpl, b activityCImpl, Fragment fragmentParam) {
            this.f47853a = singletonCImpl;
            this.f47854b = activityRetainedCImpl;
            this.f47855c = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.a.c
        public a.d a() {
            return this.f47855c.a();
        }

        @Override // xu.p.c
        public uu.g d() {
            return new o(this.f47853a, this.f47854b, this.f47855c, this.f47856d);
        }

        @Override // com.baicizhan.main.home.plan.n1
        public void e(WordPlanFragment wordPlanFragment) {
            p(wordPlanFragment);
        }

        @Override // bb.f
        public void f(bb.d fmFragment) {
            m(fmFragment);
        }

        @Override // com.baicizhan.main.activity.schedule_v2.switchschedule.p
        public void h(SwitchScheduleFragment switchScheduleFragment) {
            o(switchScheduleFragment);
        }

        @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.x1
        public void i(GamingPlanFragment gamingPlanFragment) {
            n(gamingPlanFragment);
        }

        @Override // com.baicizhan.client.business.webview.ui.BczWebFragment_GeneratedInjector
        public void injectBczWebFragment(BczWebFragment bczWebFragment) {
            l(bczWebFragment);
        }

        @Override // com.baicizhan.main.activity.schedule_v2.adjustschedule.w0
        public void j(AdjustScheduleClassicFragment adjustScheduleClassicFragment) {
            k(adjustScheduleClassicFragment);
        }

        @uo.a
        public final AdjustScheduleClassicFragment k(AdjustScheduleClassicFragment instance3) {
            x0.c(instance3, this.f47854b.f47844d.get());
            return instance3;
        }

        @uo.a
        public final BczWebFragment l(BczWebFragment instance) {
            BczWebFragment_MembersInjector.injectMStudyCommitter(instance, this.f47853a.A.get());
            BczWebFragment_MembersInjector.injectMDakaRepo(instance, this.f47853a.f47885y.get());
            BczWebFragment_MembersInjector.injectMWinningStreak(instance, this.f47853a.f47868h.get());
            BczWebFragment_MembersInjector.injectMIExperienceRepo(instance, this.f47853a.f47873m.get());
            return instance;
        }

        @uo.a
        public final bb.d m(bb.d instance2) {
            bb.g.b(instance2, this.f47853a.t());
            return instance2;
        }

        @uo.a
        public final GamingPlanFragment n(GamingPlanFragment instance4) {
            y1.c(instance4, this.f47854b.f47844d.get());
            return instance4;
        }

        @uo.a
        public final SwitchScheduleFragment o(SwitchScheduleFragment instance5) {
            com.baicizhan.main.activity.schedule_v2.switchschedule.q.c(instance5, this.f47854b.f47844d.get());
            return instance5;
        }

        @uo.a
        public final WordPlanFragment p(WordPlanFragment instance6) {
            o1.c(instance6, this.f47853a.t());
            return instance6;
        }

        @Override // com.baicizhan.main.wikiv2.lookup.wikiv2.d0
        public void b(WikiSceneFragment wikiSceneFragment) {
        }

        @Override // com.baicizhan.main.activity.schedule_v2.mutimode.m
        public void c(com.baicizhan.main.activity.schedule_v2.mutimode.l modeDesDialog) {
        }

        @Override // he.u
        public void g(MyTabFragment myTabFragment) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends f.i {
        public t<z9.b> A;
        public t<i1> B;
        public t<g1> C;
        public t<RemoteMultiModeRepo> D;
        public t<com.baicizhan.main.activity.schedule_v2.mutimode.data.b> E;
        public t<DeviceRepoImpl> F;
        public t<ie.a> G;
        public t<c0> H;
        public t<com.baicizhan.main.home.experiment.repo.t> I;
        public t<CacheAchievementRepo> J;
        public t<com.baicizhan.main.activity.mytab.task.data.g> K;
        public t<CachedTasksRepository> L;
        public t<com.baicizhan.main.activity.mytab.task.data.h> M;
        public t<k3.s0> N;
        public t<j3> O;
        public t<WordListDb> P;
        public t<nc.a> Q;
        public t<WordResRepoImpl> R;
        public t<com.baicizhan.main.wordlistv2.repo.d> S;
        public t<RemoteImpl> T;
        public t<com.baicizhan.main.wordlistv2.repo.c> U;
        public t<r> V;
        public t<com.baicizhan.main.wordlistv2.a> W;

        /* renamed from: a, reason: collision with root package name */
        public final zu.c f47861a;

        /* renamed from: b, reason: collision with root package name */
        public final j f47862b = this;

        /* renamed from: c, reason: collision with root package name */
        public t<nc.a> f47863c;

        /* renamed from: d, reason: collision with root package name */
        public t<aa.c> f47864d;

        /* renamed from: e, reason: collision with root package name */
        public t<aa.a> f47865e;

        /* renamed from: f, reason: collision with root package name */
        public t<nc.a> f47866f;

        /* renamed from: g, reason: collision with root package name */
        public t<WinningStreakImpl> f47867g;

        /* renamed from: h, reason: collision with root package name */
        public t<com.baicizhan.client.business.managers.winningstreak.a> f47868h;

        /* renamed from: i, reason: collision with root package name */
        public t<EXPDb> f47869i;

        /* renamed from: j, reason: collision with root package name */
        public t<ExpImpl> f47870j;

        /* renamed from: k, reason: collision with root package name */
        public t<com.baicizhan.client.business.managers.experience.data.remote.b> f47871k;

        /* renamed from: l, reason: collision with root package name */
        public t<u9.b> f47872l;

        /* renamed from: m, reason: collision with root package name */
        public t<u9.d> f47873m;

        /* renamed from: n, reason: collision with root package name */
        public t<TaskImpl> f47874n;

        /* renamed from: o, reason: collision with root package name */
        public t<com.baicizhan.client.business.managers.experience.data.remote.c> f47875o;

        /* renamed from: p, reason: collision with root package name */
        public t<com.baicizhan.main.home.experiment.repo.p> f47876p;

        /* renamed from: q, reason: collision with root package name */
        public t<com.baicizhan.main.home.experiment.repo.s> f47877q;

        /* renamed from: r, reason: collision with root package name */
        public t<HomeRepo> f47878r;

        /* renamed from: s, reason: collision with root package name */
        public t<e1> f47879s;

        /* renamed from: t, reason: collision with root package name */
        public t<com.baicizhan.main.home.plan.module.exam.a> f47880t;

        /* renamed from: u, reason: collision with root package name */
        public t<l0> f47881u;

        /* renamed from: v, reason: collision with root package name */
        public t<qg.n0> f47882v;

        /* renamed from: w, reason: collision with root package name */
        public t<qg.m0> f47883w;

        /* renamed from: x, reason: collision with root package name */
        public t<DakaRepoImpl> f47884x;

        /* renamed from: y, reason: collision with root package name */
        public t<z9.a> f47885y;

        /* renamed from: z, reason: collision with root package name */
        public t<z9.c> f47886z;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<T> implements t<T> {

            /* renamed from: a, reason: collision with root package name */
            public final j f47887a;

            /* renamed from: b, reason: collision with root package name */
            public final int f47888b;

            public a(j singletonCImpl, int id2) {
                this.f47887a = singletonCImpl;
                this.f47888b = id2;
            }

            @Override // javax.inject.Provider, vz.c
            public T get() {
                switch (this.f47888b) {
                    case 0:
                        return (T) new aa.c(this.f47887a.f47863c.get());
                    case 1:
                        return (T) q9.o.c();
                    case 2:
                        return (T) new WinningStreakImpl(this.f47887a.q(), this.f47887a.f47865e.get(), v.c());
                    case 3:
                        return (T) q9.p.c();
                    case 4:
                        return (T) new u9.b(v.c(), this.f47887a.n(), this.f47887a.r(), this.f47887a.f47871k.get(), this.f47887a.f47865e.get());
                    case 5:
                        return (T) v9.c.b(zu.e.c(this.f47887a.f47861a));
                    case 6:
                        return (T) new ExpImpl();
                    case 7:
                        return (T) new TaskImpl();
                    case 8:
                        return (T) new com.baicizhan.main.home.experiment.repo.p(this.f47887a.f47863c.get(), this.f47887a.f47866f.get(), v.c());
                    case 9:
                        return (T) new HomeRepo();
                    case 10:
                        return (T) qg.f.b(this.f47887a.f47880t.get());
                    case 11:
                        return (T) qg.e.b();
                    case 12:
                        return (T) new qg.n0(this.f47887a.f47880t.get(), this.f47887a.f47866f.get());
                    case 13:
                        return (T) new z9.c(this.f47887a.f47868h.get(), this.f47887a.f47885y.get(), this.f47887a.f47873m.get());
                    case 14:
                        return (T) new DakaRepoImpl(zu.e.c(this.f47887a.f47861a));
                    case 15:
                        return (T) new i1();
                    case 16:
                        return (T) new RemoteMultiModeRepo(this.f47887a.f47863c.get());
                    case 17:
                        return (T) new DeviceRepoImpl(this.f47887a.f47863c.get());
                    case 18:
                        return (T) new c0(v.c(), q9.t.a(), zu.e.c(this.f47887a.f47861a));
                    case 19:
                        return (T) new CacheAchievementRepo(this.f47887a.f47866f.get());
                    case 20:
                        return (T) new CachedTasksRepository(this.f47887a.f47866f.get(), this.f47887a.f47863c.get());
                    case 21:
                        return (T) ti.b.c(zu.d.c(this.f47887a.f47861a));
                    case 22:
                        return (T) ti.c.c(zu.d.c(this.f47887a.f47861a));
                    case 23:
                        return (T) new r(this.f47887a.S.get(), v.c(), this.f47887a.U.get());
                    case 24:
                        return (T) new WordResRepoImpl(this.f47887a.u(), this.f47887a.Q.get());
                    case 25:
                        return (T) com.baicizhan.main.wordlistv2.repo.n.c(zu.e.c(this.f47887a.f47861a));
                    case 26:
                        return (T) com.baicizhan.main.wordlistv2.repo.g.c();
                    case 27:
                        return (T) new RemoteImpl(zu.e.c(this.f47887a.f47861a));
                    default:
                        throw new AssertionError(this.f47888b);
                }
            }
        }

        public j(zu.c applicationContextModuleParam) {
            this.f47861a = applicationContextModuleParam;
            o(applicationContextModuleParam);
            p(applicationContextModuleParam);
        }

        @Override // qg.x0
        public l0 a() {
            return this.f47881u.get();
        }

        @Override // xu.o.a
        public uu.d b() {
            return new h(this.f47862b);
        }

        @Override // q9.w
        public u9.d c() {
            return this.f47873m.get();
        }

        @Override // com.baicizhan.main.home.plan.allinone.n1
        public e1 d() {
            return this.f47879s.get();
        }

        @Override // com.baicizhan.main.home.experiment.repo.o
        public com.baicizhan.main.home.experiment.repo.s f() {
            return this.f47877q.get();
        }

        @Override // qg.x0
        public qg.y0 g() {
            return new qg.y0(this.f47883w.get());
        }

        @Override // q9.w
        public com.baicizhan.client.business.managers.winningstreak.a h() {
            return this.f47868h.get();
        }

        @Override // q9.w
        public aa.a i() {
            return this.f47865e.get();
        }

        @Override // su.a.b
        public Set<Boolean> j() {
            return ImmutableSet.of();
        }

        @Override // q9.w
        public u9.f k() {
            return t();
        }

        @Override // xu.b.InterfaceC1329b
        public uu.b l() {
            return new c(this.f47862b);
        }

        public w9.a n() {
            return v9.b.a(this.f47869i.get());
        }

        public final void o(final zu.c applicationContextModuleParam) {
            this.f47863c = tv.g.e(new a(this.f47862b, 1));
            a aVar = new a(this.f47862b, 0);
            this.f47864d = aVar;
            this.f47865e = tv.g.e(aVar);
            this.f47866f = tv.g.e(new a(this.f47862b, 3));
            a aVar2 = new a(this.f47862b, 2);
            this.f47867g = aVar2;
            this.f47868h = tv.g.e(aVar2);
            this.f47869i = tv.g.e(new a(this.f47862b, 5));
            a aVar3 = new a(this.f47862b, 6);
            this.f47870j = aVar3;
            this.f47871k = tv.g.e(aVar3);
            a aVar4 = new a(this.f47862b, 4);
            this.f47872l = aVar4;
            this.f47873m = tv.g.e(aVar4);
            a aVar5 = new a(this.f47862b, 7);
            this.f47874n = aVar5;
            this.f47875o = tv.g.e(aVar5);
            a aVar6 = new a(this.f47862b, 8);
            this.f47876p = aVar6;
            this.f47877q = tv.g.e(aVar6);
            a aVar7 = new a(this.f47862b, 9);
            this.f47878r = aVar7;
            this.f47879s = tv.g.e(aVar7);
            this.f47880t = tv.g.e(new a(this.f47862b, 11));
            this.f47881u = tv.g.e(new a(this.f47862b, 10));
            a aVar8 = new a(this.f47862b, 12);
            this.f47882v = aVar8;
            this.f47883w = tv.g.e(aVar8);
            a aVar9 = new a(this.f47862b, 14);
            this.f47884x = aVar9;
            this.f47885y = tv.g.e(aVar9);
            a aVar10 = new a(this.f47862b, 13);
            this.f47886z = aVar10;
            this.A = tv.g.e(aVar10);
        }

        public final void p(final zu.c applicationContextModuleParam) {
            a aVar = new a(this.f47862b, 15);
            this.B = aVar;
            this.C = tv.g.e(aVar);
            a aVar2 = new a(this.f47862b, 16);
            this.D = aVar2;
            this.E = tv.g.e(aVar2);
            a aVar3 = new a(this.f47862b, 17);
            this.F = aVar3;
            this.G = tv.g.e(aVar3);
            a aVar4 = new a(this.f47862b, 18);
            this.H = aVar4;
            this.I = tv.g.e(aVar4);
            a aVar5 = new a(this.f47862b, 19);
            this.J = aVar5;
            this.K = tv.g.e(aVar5);
            a aVar6 = new a(this.f47862b, 20);
            this.L = aVar6;
            this.M = tv.g.e(aVar6);
            this.N = tv.g.e(new a(this.f47862b, 21));
            this.O = tv.g.e(new a(this.f47862b, 22));
            this.P = tv.g.e(new a(this.f47862b, 25));
            this.Q = tv.g.e(new a(this.f47862b, 26));
            a aVar7 = new a(this.f47862b, 24);
            this.R = aVar7;
            this.S = tv.g.e(aVar7);
            a aVar8 = new a(this.f47862b, 27);
            this.T = aVar8;
            this.U = tv.g.e(aVar8);
            a aVar9 = new a(this.f47862b, 23);
            this.V = aVar9;
            this.W = tv.g.e(aVar9);
        }

        public ca.b q() {
            return new ca.b(this.f47866f.get());
        }

        public w9.k r() {
            return v9.d.c(this.f47869i.get());
        }

        public wc.a s() {
            return v9.e.c(this.f47869i.get());
        }

        public u9.h t() {
            return new u9.h(s(), this.f47875o.get());
        }

        public wj.b u() {
            return com.baicizhan.main.wordlistv2.repo.m.c(this.P.get());
        }

        @Override // dd.e
        public void e(BaicizhanApp baicizhanApp) {
        }
    }
}
