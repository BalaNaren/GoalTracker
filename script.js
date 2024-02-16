document.addEventListener('DOMContentLoaded', function() {
    // Check if the user is "logged in"
    if (!localStorage.getItem('loggedIn')) {
        // Not logged in, redirect to login page
        window.location.href = 'login.html';
    }
});

function addGoal() {
    const goalInput = document.getElementById('newGoal');
    const goal = goalInput.value;
    if (goal) {
        const li = document.createElement('li');
        li.textContent = goal;
        li.onclick = function() { this.parentNode.removeChild(this); };
        document.getElementById('goalList').appendChild(li);
        goalInput.value = ''; // Clear input field after adding
    } else {
        alert('Please enter a goal!');
    }
}

function logout() {
    localStorage.removeItem('loggedIn');
    window.location.href = 'login.html';
}