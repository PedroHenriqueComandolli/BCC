import { queryClient } from "../queryClient.js"
import { getGames } from "../api.js"

export async function gamesPage(){

const app =
document.getElementById("app")

const games =
await queryClient.fetchQuery({
queryKey:["games"],
queryFn:getGames
})

app.innerHTML = `
<h2>Catálogo</h2>

${games.map(game => `
<div class="game-card">
<h3>${game.title}</h3>
<p>${game.genre}</p>
<p>⭐ ${game.rating}</p>
</div>
`).join("")}
`
}