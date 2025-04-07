// Please see documentation at https://docs.microsoft.com/aspnet/core/client-side/bundling-and-minification
// for details on configuring this project to bundle and minify static web assets.

//search bar search with enter
<script>
    document.addEventListener("DOMContentLoaded", function() {
    const searchInput = document.querySelector(".navbar input[type='search']");

    searchInput.addEventListener("keydown", function(event) {
        if (event.key === "Enter") {
        event.preventDefault(); // Prevent form submission
    this.form.submit(); // Submit the form
        }
    });
});
</script>
