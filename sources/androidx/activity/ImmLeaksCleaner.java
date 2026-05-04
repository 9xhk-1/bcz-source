package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ImmLeaksCleaner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private static final c0<Cleaner> cleaner$delegate = e0.c(new x00.a<Cleaner>() { // from class: androidx.activity.ImmLeaksCleaner$Companion$cleaner$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ImmLeaksCleaner.Cleaner invoke() {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                g0.o(hField, "hField");
                g0.o(servedViewField, "servedViewField");
                g0.o(nextServedViewField, "nextServedViewField");
                return new ImmLeaksCleaner.ValidCleaner(hField, servedViewField, nextServedViewField);
            } catch (NoSuchFieldException unused) {
                return ImmLeaksCleaner.FailedInitialization.INSTANCE;
            }
        }
    });

    @m80.k
    private final Activity activity;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class Cleaner {
        public /* synthetic */ Cleaner(v vVar) {
            this();
        }

        public abstract boolean clearNextServedView(@m80.k InputMethodManager inputMethodManager);

        @m80.l
        public abstract Object getLock(@m80.k InputMethodManager inputMethodManager);

        @m80.l
        public abstract View getServedView(@m80.k InputMethodManager inputMethodManager);

        private Cleaner() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @m80.k
        public final Cleaner getCleaner() {
            return (Cleaner) ImmLeaksCleaner.cleaner$delegate.getValue();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FailedInitialization extends Cleaner {

        @m80.k
        public static final FailedInitialization INSTANCE = new FailedInitialization();

        private FailedInitialization() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(@m80.k InputMethodManager inputMethodManager) {
            g0.p(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @m80.l
        public Object getLock(@m80.k InputMethodManager inputMethodManager) {
            g0.p(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @m80.l
        public View getServedView(@m80.k InputMethodManager inputMethodManager) {
            g0.p(inputMethodManager, "<this>");
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ValidCleaner extends Cleaner {

        @m80.k
        private final Field hField;

        @m80.k
        private final Field nextServedViewField;

        @m80.k
        private final Field servedViewField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidCleaner(@m80.k Field hField, @m80.k Field servedViewField, @m80.k Field nextServedViewField) {
            super(null);
            g0.p(hField, "hField");
            g0.p(servedViewField, "servedViewField");
            g0.p(nextServedViewField, "nextServedViewField");
            this.hField = hField;
            this.servedViewField = servedViewField;
            this.nextServedViewField = nextServedViewField;
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(@m80.k InputMethodManager inputMethodManager) {
            g0.p(inputMethodManager, "<this>");
            try {
                this.nextServedViewField.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @m80.l
        public Object getLock(@m80.k InputMethodManager inputMethodManager) {
            g0.p(inputMethodManager, "<this>");
            try {
                return this.hField.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        @m80.l
        public View getServedView(@m80.k InputMethodManager inputMethodManager) {
            g0.p(inputMethodManager, "<this>");
            try {
                return (View) this.servedViewField.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(@m80.k Activity activity) {
        g0.p(activity, "activity");
        this.activity = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@m80.k LifecycleOwner source, @m80.k Lifecycle.Event event) {
        g0.p(source, "source");
        g0.p(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        Object systemService = this.activity.getSystemService("input_method");
        g0.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Cleaner cleaner = Companion.getCleaner();
        Object lock = cleaner.getLock(inputMethodManager);
        if (lock == null) {
            return;
        }
        synchronized (lock) {
            View servedView = cleaner.getServedView(inputMethodManager);
            if (servedView == null) {
                return;
            }
            if (servedView.isAttachedToWindow()) {
                return;
            }
            boolean clearNextServedView = cleaner.clearNextServedView(inputMethodManager);
            if (clearNextServedView) {
                inputMethodManager.isActive();
            }
        }
    }
}
