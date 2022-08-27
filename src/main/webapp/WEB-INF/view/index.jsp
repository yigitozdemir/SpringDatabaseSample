<html>
<head>
</head>
<body>
<script src="https://unpkg.com/vue@3"></script>

<div id="app">{{ message }}</div>
<p>${firstName}</p>

<script>
  const { createApp } = Vue

  createApp({
    data() {
      return {
        message: 'Database Sample! Hello Vue!'
      }
    }
  }).mount('#app')
</script>

</body>
</html>