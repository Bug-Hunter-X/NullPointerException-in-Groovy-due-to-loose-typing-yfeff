```groovy
def foo(a, b) {
  a = a ?: 0 // Assign 0 if a is null
  b = b ?: 0 // Assign 0 if b is null
  return a + b
}

println foo(1, 2) // 3
println foo(null, 2) // 2
println foo(1, null) // 1
println foo(null, null) // 0
```