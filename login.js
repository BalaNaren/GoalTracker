function login() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    
    if(username === "user" && password === "pass") {
        // Simulate login by setting a flag
        localStorage.setItem('loggedIn', true);
        window.location.href = 'index.html';
    } else {
        alert('Invalid username or password');
    }
}
