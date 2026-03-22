# Java 25 LTS — Feature Reference

> Released: September 16, 2025 | LTS (5+ years support) | 18 JEPs

---
JEP - Java Enhancement Proposal
## ✅ Language

| JEP | Feature | What it does |
|-----|---------|-------------|
| 512 | Compact Source Files & Instance Main Methods | No more boilerplate `public static void main(String[] args)` — write minimal programs and scale up |
| 513 | Flexible Constructor Bodies | Validate/throw exceptions *before* `super()` or `this()` in constructors |
| 511 | Module Import Declarations | Import all exported packages from a module in a single line |

---

## ⚡ Concurrency (Project Loom)

| JEP | Feature | What it does |
|-----|---------|-------------|
| 506 | Scoped Values | Immutable, virtual-thread-safe alternative to `ThreadLocal` — no side effects or memory leaks |
| 505 | Structured Concurrency *(4th Preview)* | Treats related tasks across threads as one unit — simpler cancellation, error handling & observability |

---

## 🚀 Performance (Project Leyden)

| JEP | Feature | What it does |
|-----|---------|-------------|
| 514 | AOT Command-Line Ergonomics | Simplifies commands to create ahead-of-time caches for faster startup |
| 515 | AOT Method Profiling | Reuses hot-method profiles from prior runs — reaches peak performance faster |

---

## 🗑️ Garbage Collection

| JEP | Feature | What it does |
|-----|---------|-------------|
| 519 | Compact Object Headers | Shrinks object headers from 96–128 bits → 64 bits, reducing heap memory footprint |
| 521 | Generational Shenandoah GC | Adds young/old generation support to Shenandoah — lower pause times |
| 474 | ZGC Generational Mode by Default | ZGC now defaults to generational mode for better short-lived object handling |

---

## 🔒 Security & Cryptography

| JEP | Feature | What it does |
|-----|---------|-------------|
| 478 | Key Derivation Function (KDF) API | Standard API to derive cryptographic keys from a shared secret + additional data |
| 470 | PEM Encodings API *(Preview)* | Read/write PEM-encoded keys and certificates via a standard Java API |

---

## 🔭 Observability (JFR)

| JEP | Feature | What it does |
|-----|---------|-------------|
| 518 | JFR Cooperative Sampling | Threads report profiling data at safe points — lower overhead, higher accuracy |
| 520 | JFR Method Timing & Tracing | Records exact timing of all method calls, not just sampled ones |
| 509 | JFR CPU-Time Profiling *(Experimental)* | Measures CPU time including native/system code — Linux only |

---

## 🧪 Preview & Incubator

| JEP | Feature | What it does |
|-----|---------|-------------|
| 502 | Stable Values *(Preview)* | Lazy-initialized constants the JVM treats like `final` — faster than `volatile`, safer than `final` |
| 507 | Primitive Types in Patterns *(3rd Preview)* | Pattern match on primitives directly — no boxing, no verbosity |
| 508 | Vector API *(10th Incubator)* | Maps vector math ops to CPU SIMD instructions for high-performance computation |

---

## 🗑️ Removals

| JEP | What was removed |
|-----|-----------------|
| 503 | 32-bit x86 port (all 32-bit ports now gone) |
| —   | Experimental Graal JIT compiler |

---

## 📌 Quick Summary

- **Language**: Less boilerplate, smarter constructors, easier imports
- **Concurrency**: Scoped Values finalized; Structured Concurrency in preview
- **Performance**: AOT improvements across the board (Project Leyden)
- **GC**: Compact headers + generational ZGC/Shenandoah by default
- **Security**: KDF API finalized; PEM API in preview
- **Observability**: Richer, lower-overhead JFR profiling

> **LTS Support**: Premier support through ~2030, Extended support through ~2033