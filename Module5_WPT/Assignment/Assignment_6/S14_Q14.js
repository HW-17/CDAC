async function fetchData() {
    try {
        const response = await fetch("https://jsonplaceholder.typicode.com/posts");

        // Check if the response is okay (status 200-299)
        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        const data = await response.json();
        console.log(data); // Log the fetched data to the console
    } catch (error) {
        console.error("Error fetching data:", error);
    }
}

// Call the async function to execute the fetch
fetchData();