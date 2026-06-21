export async function getGames() {

const response =
await fetch("./js/data/games.json")

return response.json()

}