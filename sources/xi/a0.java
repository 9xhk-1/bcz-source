package xi;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.widget.WikiVideoView;
import gs.on;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import xi.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class a0 extends li.e<com.baicizhan.main.wikiv2.study.model.h, a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f98064f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final wi.n f98065e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<on> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a0 f98066e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k a0 a0Var, on binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f98066e = a0Var;
        }

        public static final void o(com.baicizhan.main.wikiv2.study.model.h hVar, a0 a0Var, boolean z11) {
            hVar.f(z11);
            if (z11) {
                a0Var.f98065e.t();
            }
        }

        public static final void p(com.baicizhan.main.wikiv2.study.model.h hVar, MediaPlayer mediaPlayer) {
            hVar.h().setValue(Boolean.FALSE);
        }

        public static final void q(on onVar, Boolean bool) {
            if (bool == null || bool.booleanValue()) {
                return;
            }
            onVar.f56265c.u();
        }

        public static final void r(on onVar, a aVar, com.baicizhan.main.wikiv2.study.model.h hVar) {
            boolean n11 = onVar.f56265c.n();
            if (n11) {
                aVar.t(onVar);
            } else {
                if (n11) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.u(onVar);
            }
            hVar.b().setValue(Boolean.valueOf(onVar.f56265c.n()));
        }

        public static final void s(on onVar, a aVar, Boolean bool) {
            if (bool == null || bool.booleanValue() || !onVar.f56265c.n()) {
                return;
            }
            aVar.t(onVar);
        }

        public final void n(@m80.k final com.baicizhan.main.wikiv2.study.model.h tv2) {
            g0.p(tv2, "tv");
            on b11 = b();
            final a0 a0Var = this.f98066e;
            final on onVar = b11;
            onVar.f56264b.f56544a.setText(tv2.a());
            onVar.f56265c.setFullscreenEnabled(true);
            onVar.f56265c.setVideoURI(tv2.d());
            onVar.f56265c.setSnapshot(tv2.e());
            onVar.f56265c.setOnToggleListener(new WikiVideoView.f() { // from class: xi.v
                @Override // com.baicizhan.client.business.widget.WikiVideoView.f
                public final void a(boolean z11) {
                    a0.a.o(com.baicizhan.main.wikiv2.study.model.h.this, a0Var, z11);
                }
            });
            onVar.f56265c.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: xi.w
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    a0.a.p(com.baicizhan.main.wikiv2.study.model.h.this, mediaPlayer);
                }
            });
            tv2.h().observe(this, new Observer() { // from class: xi.x
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    a0.a.q(on.this, (Boolean) obj);
                }
            });
            onVar.f56265c.setOnFullscreenListener(new WikiVideoView.e() { // from class: xi.y
                @Override // com.baicizhan.client.business.widget.WikiVideoView.e
                public final void a() {
                    a0.a.r(on.this, this, tv2);
                }
            });
            tv2.b().removeObservers(a0Var.p());
            tv2.b().observe(a0Var.p(), new Observer() { // from class: xi.z
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    a0.a.s(on.this, this, (Boolean) obj);
                }
            });
            onVar.executePendingBindings();
        }

        public final void t(@m80.k on binding) {
            FragmentActivity activity;
            Window window;
            View decorView;
            g0.p(binding, "binding");
            if (!(this.f98066e.p() instanceof Fragment) || (activity = ((Fragment) this.f98066e.p()).getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            a0 a0Var = this.f98066e;
            ViewGroup viewGroup = (ViewGroup) decorView;
            int childCount = viewGroup.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof WikiVideoView) {
                    viewGroup.removeView(childAt);
                    binding.f56266d.removeAllViews();
                    binding.f56266d.addView(childAt);
                    break;
                }
                i11++;
            }
            binding.f56265c.setFullscreen(false);
            ((Fragment) a0Var.p()).requireActivity().setRequestedOrientation(1);
        }

        public final void u(@m80.k on binding) {
            FragmentActivity activity;
            Window window;
            View decorView;
            g0.p(binding, "binding");
            if (!(this.f98066e.p() instanceof Fragment) || (activity = ((Fragment) this.f98066e.p()).getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            a0 a0Var = this.f98066e;
            binding.f56266d.removeView(binding.f56265c);
            ((ViewGroup) decorView).addView(binding.f56265c);
            binding.f56265c.setFullscreen(true);
            ((Fragment) a0Var.p()).requireActivity().setRequestedOrientation(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@m80.k LifecycleOwner lifecycleOwner, @m80.k wi.n viewModel) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f98065e = viewModel;
    }

    @Override // li.e
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void l(@m80.k a holder) {
        g0.p(holder, "holder");
        if (holder.b().f56266d.getChildCount() != 0) {
            holder.b().f56265c.u();
        }
        super.l(holder);
    }

    @Override // p50.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.study.model.h item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        holder.n(item);
        o(holder);
    }

    @Override // li.e
    @m80.k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        return new a(this, (on) wi.p.f96399a.b(on.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        if (holder.b().f56265c.o()) {
            holder.b().f56265c.u();
        }
        wi.p.f96399a.d(on.class, holder.b());
    }
}
