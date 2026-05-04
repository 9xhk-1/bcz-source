package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class w7 {
    @go.d
    @go.c
    @uo.a
    public static <E> int a(BlockingQueue<E> q11, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit) throws InterruptedException {
        Preconditions.checkNotNull(buffer);
        long nanoTime = System.nanoTime() + unit.toNanos(timeout);
        int i11 = 0;
        while (i11 < numElements) {
            i11 += q11.drainTo(buffer, numElements - i11);
            if (i11 < numElements) {
                E poll = q11.poll(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (poll == null) {
                    return i11;
                }
                buffer.add(poll);
                i11++;
            }
        }
        return i11;
    }

    @go.d
    @go.c
    @uo.a
    public static <E> int b(BlockingQueue<E> q11, Collection<? super E> buffer, int numElements, long timeout, TimeUnit unit) {
        E poll;
        Preconditions.checkNotNull(buffer);
        long nanoTime = System.nanoTime() + unit.toNanos(timeout);
        int i11 = 0;
        boolean z11 = false;
        while (i11 < numElements) {
            try {
                i11 += q11.drainTo(buffer, numElements - i11);
                if (i11 < numElements) {
                    while (true) {
                        try {
                            poll = q11.poll(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z11 = true;
                        }
                    }
                    if (poll == null) {
                        break;
                    }
                    buffer.add(poll);
                    i11++;
                }
            } finally {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return i11;
    }

    @go.d
    @go.c
    public static <E> ArrayBlockingQueue<E> c(int capacity) {
        return new ArrayBlockingQueue<>(capacity);
    }

    public static <E> ArrayDeque<E> d() {
        return new ArrayDeque<>();
    }

    public static <E> ArrayDeque<E> e(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new ArrayDeque<>((Collection) elements);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        k6.a(arrayDeque, elements);
        return arrayDeque;
    }

    @go.d
    @go.c
    public static <E> ConcurrentLinkedQueue<E> f() {
        return new ConcurrentLinkedQueue<>();
    }

    @go.d
    @go.c
    public static <E> ConcurrentLinkedQueue<E> g(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new ConcurrentLinkedQueue<>((Collection) elements);
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        k6.a(concurrentLinkedQueue, elements);
        return concurrentLinkedQueue;
    }

    @go.d
    @go.c
    public static <E> LinkedBlockingDeque<E> h() {
        return new LinkedBlockingDeque<>();
    }

    @go.d
    @go.c
    public static <E> LinkedBlockingDeque<E> i(int capacity) {
        return new LinkedBlockingDeque<>(capacity);
    }

    @go.d
    @go.c
    public static <E> LinkedBlockingDeque<E> j(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedBlockingDeque<>((Collection) elements);
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        k6.a(linkedBlockingDeque, elements);
        return linkedBlockingDeque;
    }

    @go.d
    @go.c
    public static <E> LinkedBlockingQueue<E> k() {
        return new LinkedBlockingQueue<>();
    }

    @go.d
    @go.c
    public static <E> LinkedBlockingQueue<E> l(int capacity) {
        return new LinkedBlockingQueue<>(capacity);
    }

    @go.d
    @go.c
    public static <E> LinkedBlockingQueue<E> m(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new LinkedBlockingQueue<>((Collection) elements);
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        k6.a(linkedBlockingQueue, elements);
        return linkedBlockingQueue;
    }

    @go.d
    @go.c
    public static <E extends Comparable> PriorityBlockingQueue<E> n() {
        return new PriorityBlockingQueue<>();
    }

    @go.d
    @go.c
    public static <E extends Comparable> PriorityBlockingQueue<E> o(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new PriorityBlockingQueue<>((Collection) elements);
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        k6.a(priorityBlockingQueue, elements);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> p() {
        return new PriorityQueue<>();
    }

    public static <E extends Comparable> PriorityQueue<E> q(Iterable<? extends E> elements) {
        if (elements instanceof Collection) {
            return new PriorityQueue<>((Collection) elements);
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        k6.a(priorityQueue, elements);
        return priorityQueue;
    }

    @go.d
    @go.c
    public static <E> SynchronousQueue<E> r() {
        return new SynchronousQueue<>();
    }

    @go.d
    public static <E> Deque<E> s(Deque<E> deque) {
        return e9.i(deque, null);
    }

    @go.d
    public static <E> Queue<E> t(Queue<E> queue) {
        return e9.t(queue, null);
    }
}
