import { queryClient } from "../queryClient.js"
import { getGames } from "../api.js"

export async function dashboard(){

const app =
document.getElementById("app")

let games =
await queryClient.fetchQuery({
queryKey:["games"],
queryFn:getGames
})

app.innerHTML = `
<h2>Dashboard</h2>

<div class="cards">

<div class="card">
<h3>Total Jogos</h3>
<p>${games.length}</p>
</div>

</div>
`
}