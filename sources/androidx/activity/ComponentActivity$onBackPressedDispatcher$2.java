package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComponentActivity$onBackPressedDispatcher$2 extends Lambda implements x00.a<OnBackPressedDispatcher> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ComponentActivity componentActivity) {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e11) {
            if (!g0.g(e11.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e11;
            }
        } catch (NullPointerException e12) {
            if (!g0.g(e12.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e12;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x00.a
    public final OnBackPressedDispatcher invoke() {
        final ComponentActivity componentActivity = this.this$0;
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$0(ComponentActivity.this);
            }
        });
        final ComponentActivity componentActivity2 = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!g0.g(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.access$addObserverForBackInvoker(ComponentActivity.this, onBackPressedDispatcher);
                    }
                });
                return onBackPressedDispatcher;
            }
            componentActivity2.addObserverForBackInvoker(onBackPressedDispatcher);
        }
        return onBackPressedDispatcher;
    }
}
