package sa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends DefaultItemAnimator {

    /* renamed from: b, reason: collision with root package name */
    public static final int f88180b = 600;

    /* renamed from: a, reason: collision with root package name */
    public int f88181a = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.ViewHolder f88182a;

        public a(final RecyclerView.ViewHolder val$holder) {
            this.f88182a = val$holder;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            i.this.dispatchAddFinished(this.f88182a);
        }
    }

    public final void a(final RecyclerView.ViewHolder holder) {
        holder.itemView.setTranslationY(xb.f.f(holder.itemView.getContext()));
        holder.itemView.setRotation(-10.0f);
        holder.itemView.animate().translationY(0.0f).rotation(0.0f).setInterpolator(new DecelerateInterpolator(3.0f)).setDuration(600L).setListener(new a(holder)).start();
    }

    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        int layoutPosition = viewHolder.getLayoutPosition();
        int i11 = this.f88181a;
        if (layoutPosition <= i11) {
            dispatchAddFinished(viewHolder);
            return false;
        }
        this.f88181a = i11 + 1;
        a(viewHolder);
        return false;
    }
}
