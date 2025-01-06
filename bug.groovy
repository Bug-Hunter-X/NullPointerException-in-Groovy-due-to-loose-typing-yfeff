```groovy
def foo(a, b) {
  if (a == null || b == null) {
    return null
  }
  return a + b
}

println foo(1, 2) // 3
println foo(null, 2) // null
println foo(1, null) // null
println foo(null, null) // null
```