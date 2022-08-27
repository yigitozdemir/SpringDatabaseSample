<html>
<head>
</head>
<body>
<script src="https://unpkg.com/vue@3"></script>

<div id="app">{{ message }}</div>

<script>
  const { createApp } = Vue

  createApp({
    data() {
      return {
        message: 'Database Sample! Hello Vue! This is index2'
      }
    }
  }).mount('#app')
</script>

</body>
</html>