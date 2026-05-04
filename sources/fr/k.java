package fr;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public abstract class k<TResult> {
    public k<TResult> addOnCanceledListener(Activity activity, f fVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public k<TResult> addOnCompleteListener(Activity activity, g<TResult> gVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract k<TResult> addOnFailureListener(Activity activity, h hVar);

    public abstract k<TResult> addOnFailureListener(h hVar);

    public abstract k<TResult> addOnFailureListener(Executor executor, h hVar);

    public abstract k<TResult> addOnSuccessListener(Activity activity, i<TResult> iVar);

    public abstract k<TResult> addOnSuccessListener(i<TResult> iVar);

    public abstract k<TResult> addOnSuccessListener(Executor executor, i<TResult> iVar);

    public <TContinuationResult> k<TContinuationResult> continueWith(d<TResult, TContinuationResult> dVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> k<TContinuationResult> continueWithTask(d<TResult, k<TContinuationResult>> dVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <E extends Throwable> TResult getResultThrowException(Class<E> cls) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> k<TContinuationResult> onSuccessTask(j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public k<TResult> addOnCanceledListener(f fVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public k<TResult> addOnCompleteListener(g<TResult> gVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> k<TContinuationResult> continueWith(Executor executor, d<TResult, TContinuationResult> dVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> k<TContinuationResult> continueWithTask(Executor executor, d<TResult, k<TContinuationResult>> dVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> k<TContinuationResult> onSuccessTask(Executor executor, j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public k<TResult> addOnCanceledListener(Executor executor, f fVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public k<TResult> addOnCompleteListener(Executor executor, g<TResult> gVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
