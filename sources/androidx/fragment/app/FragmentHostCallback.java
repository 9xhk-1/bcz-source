package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class FragmentHostCallback<H> extends FragmentContainer {

    @m80.l
    private final Activity activity;

    @m80.k
    private final Context context;

    @m80.k
    private final FragmentManager fragmentManager;

    @m80.k
    private final Handler handler;
    private final int windowAnimations;

    public FragmentHostCallback(@m80.l Activity activity, @m80.k Context context, @m80.k Handler handler, int i11) {
        g0.p(context, "context");
        g0.p(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i11;
        this.fragmentManager = new FragmentManagerImpl();
    }

    @m80.l
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Activity getActivity() {
        return this.activity;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @m80.k
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @m80.k
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @m80.k
    public final Handler getHandler() {
        return this.handler;
    }

    public void onDump(@m80.k String prefix, @m80.l FileDescriptor fileDescriptor, @m80.k PrintWriter writer, @m80.l String[] strArr) {
        g0.p(prefix, "prefix");
        g0.p(writer, "writer");
    }

    @Override // androidx.fragment.app.FragmentContainer
    @m80.l
    public View onFindViewById(int i11) {
        return null;
    }

    public abstract H onGetHost();

    @m80.k
    public LayoutInflater onGetLayoutInflater() {
        LayoutInflater from = LayoutInflater.from(this.context);
        g0.o(from, "from(context)");
        return from;
    }

    public int onGetWindowAnimations() {
        return this.windowAnimations;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    @yz.n(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link RequestMultiplePermissions}. This method will still be called when Fragments\n      call the deprecated <code>requestPermissions()</code> method.")
    public void onRequestPermissionsFromFragment(@m80.k Fragment fragment, @m80.k String[] permissions, int i11) {
        g0.p(fragment, "fragment");
        g0.p(permissions, "permissions");
    }

    public boolean onShouldSaveFragmentState(@m80.k Fragment fragment) {
        g0.p(fragment, "fragment");
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(@m80.k String permission) {
        g0.p(permission, "permission");
        return false;
    }

    public void onStartActivityFromFragment(@m80.k Fragment fragment, @m80.k Intent intent, int i11) {
        g0.p(fragment, "fragment");
        g0.p(intent, "intent");
        onStartActivityFromFragment(fragment, intent, i11, null);
    }

    @yz.n(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link StartIntentSenderForResult}. This method will still be called when Fragments\n      call the deprecated <code>startIntentSenderForResult()</code> method.")
    public void onStartIntentSenderFromFragment(@m80.k Fragment fragment, @m80.k IntentSender intent, int i11, @m80.l Intent intent2, int i12, int i13, int i14, @m80.l Bundle bundle) throws IntentSender.SendIntentException {
        g0.p(fragment, "fragment");
        g0.p(intent, "intent");
        if (i11 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.activity;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.startIntentSenderForResult(activity, intent, i11, intent2, i12, i13, i14, bundle);
    }

    public void onStartActivityFromFragment(@m80.k Fragment fragment, @m80.k Intent intent, int i11, @m80.l Bundle bundle) {
        g0.p(fragment, "fragment");
        g0.p(intent, "intent");
        if (i11 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.context, intent, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(@m80.k Context context, @m80.k Handler handler, int i11) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i11);
        g0.p(context, "context");
        g0.p(handler, "handler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(@m80.k FragmentActivity activity) {
        this(activity, activity, new Handler(), 0);
        g0.p(activity, "activity");
    }

    public void onSupportInvalidateOptionsMenu() {
    }
}
