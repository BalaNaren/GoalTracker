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
